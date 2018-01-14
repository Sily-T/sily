import React, { Component } from 'react';
import { Form, Icon, Input, Button, Checkbox } from 'antd';
import './Nav.css';
const FormItem = Form.Item;


class IForm extends Component {
    handleSubmit = (e) => {
        e.preventDefault();
        this.props.form.validateFields((err, values) => {
            if (!err) {
                console.log('Received values of form: ', values);
            }
        });
    }
    render() {
        const { getFieldDecorator } = this.props.form;
        return (
            <Form onSubmit={this.handleSubmit} className="login-form">
                <FormItem>
                    {getFieldDecorator('userName', {
                        rules: [{ required: true, message: '你忘了输入用户名!' }],
                    })(
                        <Input prefix={<Icon type="user" style={{ color: 'rgba(0,0,0,.25)' }} />} placeholder="请输入用户名" />
                    )}
                </FormItem>
                <FormItem>
                    {getFieldDecorator('password', {
                        rules: [{ required: true, message: '你忘了输入密码!' }],
                    })(
                        <Input prefix={<Icon type="lock" style={{ color: 'rgba(0,0,0,.25)' }} />} type="password" placeholder="请输入密码" />
                    )}
                </FormItem>
                <FormItem>
                    {getFieldDecorator('remember', {
                        valuePropName: 'checked',
                        initialValue: true,
                    })(
                        <Checkbox>记住我登录了</Checkbox>
                    )}
                    <a className="login-form-forgot" href="">忘记密码？</a>
                    <Button type="primary" htmlType="submit" className="login-form-button">
                        登录
                    </Button>
                    <Button type="default" htmlType="submit" className="login-form-button">
                        注册
                    </Button>
                </FormItem>
            </Form>
        );
    }
}

const Nav = Form.create()(IForm);

// ReactDOM.render(<WrappedNormalLoginForm />, mountNode);

export default Nav;
