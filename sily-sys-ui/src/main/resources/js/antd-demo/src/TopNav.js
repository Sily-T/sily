import React, { Component } from 'react';
import './TopNav.css';
import { Input,Menu, Icon } from 'antd';
// import TopNav from './TopNav';
const SubMenu = Menu.SubMenu;
const MenuItemGroup = Menu.ItemGroup;
const Search = Input.Search;
class TopNav extends Component {
    state = {
        current: 'mail',
    }
    handleClick = (e) => {
        console.log('click ', e);
        this.setState({
            current: e.key,
        });
    }
    render() {
        return (
            <Menu
                onClick={this.handleClick}
                selectedKeys={[this.state.current]}
                mode="horizontal"
                className="top-nav"
            >
                <Search
                    placeholder="请输入你查找的东西.."
                    onSearch={value => console.log(value)}
                    style={{ width: 300 ,margin:5}}
                />

                <Menu.Item key="home" className="top-nav-right">
                    <Icon type="home" />首页
                </Menu.Item>
                <SubMenu title={<span><Icon type="mail" />消息提醒</span>} >
                    <MenuItemGroup title="消息 1">
                        <Menu.Item key="setting:1">头像1</Menu.Item>
                        <Menu.Item key="setting:2">消息内容</Menu.Item>
                    </MenuItemGroup>
                    <MenuItemGroup title="消息 2">
                        <Menu.Item key="setting:3">头像2</Menu.Item>
                        <Menu.Item key="setting:4">消息内容</Menu.Item>
                    </MenuItemGroup>
                </SubMenu>
            </Menu>
        );
    }
}

// ReactDOM.render(<TopNav />, div);
export default TopNav;
