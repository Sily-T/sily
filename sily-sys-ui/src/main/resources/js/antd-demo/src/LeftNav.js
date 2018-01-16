import React, {Component} from 'react';
import './LeftNav.css';
import './font-awesome-4.7.0/css/font-awesome.css';
import {Menu, Icon} from 'antd';
import Autoset from './Autoset';

const SubMenu = Menu.SubMenu;
const MenuItemGroup = Menu.ItemGroup;

class LeftNav extends Component {
    handleClick = (e) => {
        console.log('click ', e);
    };

    render() {
        return (
            <Menu
                onClick={this.handleClick}
                style={{width: 256}}
                defaultSelectedKeys={['1']}
                defaultOpenKeys={['sub1']}
                mode="inline"
            >
                <SubMenu key="sub1" title={<span><Icon type="appstore"/> 个人 </span>}>
                    <Menu.Item key="1">联系人</Menu.Item>
                    <Menu.Item key="2">功能</Menu.Item>
                    <Menu.Item key="3">项目</Menu.Item>
                </SubMenu>
                <SubMenu key="sub2" title={<span><i className="fa fa-users"></i> 用户</span>}>
                    <Menu.Item key="5"><i className="fa fa-user-plus"></i> 新增用户</Menu.Item>
                    <Menu.Item key="6"><i className="fa fa-user-times"></i> 删除用户</Menu.Item>

                    <Menu.Item key="7"><i className="fa fa-user-o"></i> 修改用户</Menu.Item>
                    <Menu.Item key="8"><a href="html/alluser.html"><i
                        className="fa fa-user-circle-o"></i> 查询用户</a></Menu.Item>

                </SubMenu>
                <SubMenu key="sub4" title={<span><i className="fa fa-lock"></i> 权限</span>}>
                    <Menu.Item key="9"><a href="html/alluser.html"><i className="fa fa-key"></i> 角色管理</a></Menu.Item>
                    <Menu.Item key="10"><i className="fa fa-sliders"></i> 菜单管理</Menu.Item>
                </SubMenu>
                <Menu.Item key="11"><a href="html/datadictionary.html"><i className="fa fa-list-ul"></i> 数据字典</a></Menu.Item>
                <Menu.Item key="12"><a href="html/dataVis.html"><i className="fa fa-pie-chart"></i> 数据可视化</a></Menu.Item>
                <Menu.Item key="13"><i className="fa fa-flask"></i> 小工具</Menu.Item>
                <SubMenu key="sub5" title={<span><i className="fa fa-exchange"></i> ftp功能</span>}>
                    <Menu.Item key="14"> 上传文件</Menu.Item>
                    <Menu.Item key="15"> 下载文件</Menu.Item>
                </SubMenu>
                <Menu.Item key="16"><i className="fa fa-cog"></i> 系统设置</Menu.Item>
                <Menu.Item key="17"><i className="fa fa-bug"></i> bug提交</Menu.Item>
                <Menu.Item key="18"><i className="fa fa-tasks"></i> 暂未添加</Menu.Item>
                <Menu.Item key="19"><i className="fa fa-tasks"></i> 暂未添加</Menu.Item>
            </Menu>
        );
    }
}


export default LeftNav;
