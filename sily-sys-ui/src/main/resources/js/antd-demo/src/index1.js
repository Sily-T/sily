import React from 'react';
import ReactDOM from 'react-dom';
// import './TopNav.css';
import TopNav from './TopNav';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<TopNav />, document.getElementById('nav-top'));
registerServiceWorker();
