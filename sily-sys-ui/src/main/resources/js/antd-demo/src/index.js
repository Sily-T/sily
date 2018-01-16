import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import TopNav from './TopNav';
import LeftNav from "./LeftNav";
import registerServiceWorker from './registerServiceWorker';


ReactDOM.render(<TopNav />, document.getElementById('nav-top'));
ReactDOM.render(<LeftNav />, document.getElementById('nav-left'));
// ReactDOM.render(<Autoset />, document.getElementById('head-photo'));
registerServiceWorker();
