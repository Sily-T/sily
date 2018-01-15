import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Nav from './Nav';
import TopNav from './TopNav';
import registerServiceWorker from './registerServiceWorker';
import LeftNav from "./LeftNav";


ReactDOM.render(<TopNav />, document.getElementById('nav-top'));
ReactDOM.render(<LeftNav />, document.getElementById('nav-left'));
// ReactDOM.render(<App />, document.getElementById('root'));
// ReactDOM.render(<Nav />, document.getElementById('iform'));
registerServiceWorker();
