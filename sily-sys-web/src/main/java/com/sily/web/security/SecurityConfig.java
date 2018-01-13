package com.sily.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * Created on 2018年1月10日
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ImportResource({"classpath:spring/sily-servlet.xml", "classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-MyBatis.xml"})
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    // CAS单点登录服务地址
//    private final static String SSO_URL = "http://localhost:8080";

    @Resource(name = "userDetailsServiceImpl")
    private UserDetailsServiceImpl userDetailsService;

    //    @Autowired
//    DataSource dataSource;
//    InMemoryAuthenticationProvider

    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Bean
    DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder(5));
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        return daoAuthenticationProvider;
    }

    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationTokenFilter();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("ADMIN");
    }

    /**
     * 配置jwt
     *
     * @param http
     * @return void
     * Date: 2018/1/10
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
//                .addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class)
                .csrf().disable()//关闭防跨站伪请求攻击，默认启用
//                此处异常处理,但是都是返回401
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and()
//                关闭创建的session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()

                .authorizeRequests()
                // allow anonymous resource requests
                .antMatchers(
                        HttpMethod.GET,
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js"
                ).permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("auth").permitAll();
//        此处暂时注释,因为把静态资源阻止了
//                .anyRequest().authenticated();

//        自定义token放在filter链中
        http
                .addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);

        // 禁用缓存
        http.headers().cacheControl();
    }

    /**
     * 配置Spring Security的Filter链
     *
     * @date 2017/11/14
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        //        忽略任何以”/resources/”开头的请求
        web.ignoring()
                .antMatchers("/resources/**");

    }

    /**
     * 配置CAS登陆界面,指定登录入口为casEntryPoint
     * 用于通过ExceptionTranslationFilterJA-SIG中央身份验证服务（CAS）开始身份验证。
     * 用户的浏览器将被重定向到JA-SIG CAS企业级登录页面。该页面由loginUrl属性指定。
     * 一旦登录完成，CAS登录页面将重定向到service 属性指定的页面。这service是一个属于当前应用程序的HTTP URL。
     * 该serviceURL由监视CasAuthenticationFilter，这将验证CAS登录成功。
     * @date 2017/11/14
     */
//    public CasAuthenticationEntryPoint getCasAuthenticationEntryPoint() {
//        CasAuthenticationEntryPoint point = new CasAuthenticationEntryPoint();
//        point.setLoginUrl(SSO_URL + "/html/login.html"); //Cas Server的登录地址,认证的入口
//        point.setServiceProperties(serviceProperties());
//        return point;
//    }

    /**
     * 认证过滤器
     * 将Cas Server传递过来的ticket（Cas概念）封装成一个Authentication
     * 对应UsernamePasswordAuthenticationToken，其中ticket作为该Authentication的password，然后传递给AuthenticationManager进行认证。
     */
//    public CasAuthenticationFilter casAuthenticationFilter() throws Exception {
//        CasAuthenticationFilter filter = new CasAuthenticationFilter();
//        filter.setAuthenticationManager(authenticationManager());
//        return filter;
//    }
//
//    public SingleSignOutFilter singleSignOutFilter() {
//        SingleSignOutFilter filter = new SingleSignOutFilter();
//        filter.setCasServerUrlPrefix(SSO_URL);
//        filter.setIgnoreInitConfiguration(true);
//        return filter;
//    }
//对logout的filter进行设置
//    public LogoutFilter logoutFilter() {
//        SecurityContextLogoutHandler securityContextLogoutHandler=new SecurityContextLogoutHandler();
//        securityContextLogoutHandler.setInvalidateHttpSession(true); //HttpSession将从当前删除
//        securityContextLogoutHandler.setClearAuthentication(true); //Authentication将从当前删除
//        CookieClearingLogoutHandler cookieClearingLogoutHandler=new CookieClearingLogoutHandler("JSESSIONID");//此处调试前端时发现是这个名称，但不知道能否修改该名称，
//        LogoutFilter filter = new LogoutFilter(SSO_URL + "/html/login.html",securityContextLogoutHandler,cookieClearingLogoutHandler);
//        filter.setFilterProcessesUrl("/user/logout");
//        return filter;
//    }
//    @Bean
//    public CasAuthenticationProvider casAuthenticationProvider() {
//        CasAuthenticationProvider provider = new CasAuthenticationProvider();
//        provider.setTicketValidator(cas20ServiceTicketValidator());
//        provider.setServiceProperties(serviceProperties());
//        provider.setKey("an_id_for_this_auth_provider_only");
////        注入获取tsp用户的service，当CAS认证成功时, Security会自动调用此类对用户进行授权
////        包装了一个普通的UserDetailsS​​ervice实现,根据Authentication对象中包含的用户名来检索UserDetails 对象
//        provider.setAuthenticationUserDetailsService(new UserDetailsByNameServiceWrapper<>(userDetailsService));
//        return provider;
//    }

//    private ServiceProperties serviceProperties() {
//        ServiceProperties properties = new ServiceProperties();
////        Cas Server认证成功后的跳转地址，这里要跳转到我们的Spring Security应用，之后会由CasAuthenticationFilter处理，默认处理地址为/j_spring_cas_security_check
//        properties.setService(SSO_URL + "/html/login.html");
//        properties.setSendRenew(false);
//        return properties;
//    }


    /**
     *配置TicketValidator在登录认证成功后验证ticket
     *Date: 2017/11/14
     */
//    private Cas20ServiceTicketValidator cas20ServiceTicketValidator() {
//        return new Cas20ServiceTicketValidator(SSO_URL); //Cas Server访问地址的前缀，即根路径
//    }


    //    这里需要提供UserDetailsService的原因是RememberMeServices需要用到
//    @Override
//    protected UserDetailsService userDetailsService() {
//        return super.userDetailsService();
//    }


    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
//        auth.userDetailsService(userDetailsService);      //去掉该处，已用自定义的daoAuthenticationProvider
    }

    //Override method authenticationManagerBean in WebSecurityConfigurerAdapter
    //to expose the AuthenticationManager built using configure(AuthenticationManagerBuilder) as a Spring bean:
    //此处我的理解是在xml中配置一个bean,或是开启一个别名为User中Controller里面的AuthenticationManager注入做准备
    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}


