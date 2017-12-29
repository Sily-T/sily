import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class Input extends Component {
    constructor(){
        super();
        this.state={
            i:''
        }
    }
    handValue(e){
        console.log(e);
        console.log(e.target.value);
        this.setState({
            i:e.target.value
        })
        console.log("-"+this.state.i);
    }
    render () {
        return (
            <div>
                <input type='number' value={this.state.i} onChange={this.handValue.bind(this)}/>
            </div>
        )
    }
}

class PercentageShower extends Component {
    render () {
        return (
            <div>{this.props.i*100+"%"}</div>
        )
    }
}

class App extends Component {
    constructor () {
        super()
        this.state = {
            i: ''
        }
    }
    handleA(i){
        this.setState(i)
    }

    render () {
        return (
            <div><Input onChange={this.handleA.bind(this)} />
                <PercentageShower i={this.state.i}/>
            </div>
        )
    }
}

export default App;
