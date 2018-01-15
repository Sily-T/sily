import React, {Component} from 'react';
import './LeftNav.css';
import './font-awesome-4.7.0/css/font-awesome.css';
import {Menu, Icon} from 'antd';

const SubMenu = Menu.SubMenu;
const MenuItemGroup = Menu.ItemGroup;

class LeftNav extends Component {
    handleClick = (e) => {
        console.log('click ', e);
    }

    render() {
        return (
            <Menu
                onClick={this.handleClick}
                style={{width: 256}}
                defaultSelectedKeys={['1']}
                defaultOpenKeys={['sub1']}
                mode="inline"
            >
                <SubMenu key="sub1" title={<span><Icon type="appstore"/><span>个人</span></span>}>
                    {/*<MenuItemGroup key="g1" title="Item 1">*/}
                    <Menu.Item key="1">联系人</Menu.Item>
                    <Menu.Item key="2">功能</Menu.Item>
                    <Menu.Item key="2">项目</Menu.Item>
                    {/*</MenuItemGroup>*/}
                </SubMenu>
                <SubMenu key="sub2" title={<span><i className="fa fa-users"></i><span>用户</span></span>}>
                    <Menu.Item key="5"><i class="fa fa-user-plus"></i>新增用户</Menu.Item>
                    <Menu.Item key="6"><i class="fa fa-user-times"></i>删除用户</Menu.Item>

                    <Menu.Item key="7"><i class="fa fa-user-o"></i>修改用户</Menu.Item>
                    <Menu.Item key="8"><i class="fa fa-user-circle-o"></i>查询用户</Menu.Item>

                </SubMenu>
                <SubMenu key="sub4" title={<span><i class="fa fa-lock"></i><span>权限</span></span>}>
                    <Menu.Item key="9"><i class="fa fa-key"></i>角色管理</Menu.Item>
                    <Menu.Item key="10"><i class="fa fa-sliders"></i>菜单管理</Menu.Item>
                </SubMenu>
                <Menu.Item key="11"><i class="fa fa-list-ul"></i> <span>数据字典</span></Menu.Item>
                <Menu.Item key="12"><i class="fa fa-bar-chart"></i> <span>数据可视化</span></Menu.Item>
                <Menu.Item key="13"><i class="fa fa-flask"></i> <span>小工具</span></Menu.Item>
                <Menu.Item key="14"><i class="fa fa-cog"></i> <span >系统设置</span></Menu.Item>
                <Menu.Item key="15"><i class="fa fa-bug"></i> <span >bug提交</span></Menu.Item>
                <Menu.Item key="16"><i class="fa fa-tasks"></i> <span>暂未添加</span></Menu.Item>
                <Menu.Item key="17"><i class="fa fa-tasks"></i> <span>暂未添加</span></Menu.Item>
            </Menu>
        );
    }
}


export default LeftNav;
