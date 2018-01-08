import com.sily.api.SysMenu;
import com.sily.web.util.MenuTreeUtil;
import com.sily.web.vm.MenuVM;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Lime
 * @date 2018/1/8
 */
public class TestMenu {
    public static void main(String[] args) {
        SysMenu sysMenu = new SysMenu(1L, "用户管理", 0, new Date(), 0, "",
                "","", 1, null, null, null,
                null, null, null,null);
        SysMenu sysMenua = new SysMenu(1L, "权限管理", 0, new Date(), 0, "",
                "","", 1, null, null, null,
                null, null, null,null);
        List<SysMenu> menuVMList=new ArrayList<>();
        menuVMList.add(sysMenu);
        menuVMList.add(sysMenua);
        MenuTreeUtil.getMenu(menuVMList);
    }
}
