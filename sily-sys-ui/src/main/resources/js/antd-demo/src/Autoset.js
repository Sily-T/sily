import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import { Avatar, Button } from 'antd';
import LeftNav from "./LeftNav";

const UserList = ['U', 'Lucy', 'Tom', 'Edward'];
const colorList = ['#f56a00', '#7265e6', '#ffbf00', '#00a2ae'];

class Autoset extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            user: UserList[0],
            color: colorList[0],
        };
    }
    changeUser = () => {
        const index = UserList.indexOf(this.state.user);
        this.setState({
            user: index < UserList.length - 1 ? UserList[index + 1] : UserList[0],
            color: index < colorList.length - 1 ? colorList[index + 1] : colorList[0],
        });
    }
    render() {
        return (
            <div>
                <Avatar style={{ backgroundColor: this.state.color, verticalAlign: 'middle' }} size="large">
                    {this.state.user}
                </Avatar>
            </div>
        );
    }
}
export default Autoset;
// ReactDOM.render(<Autoset />
//     , div);