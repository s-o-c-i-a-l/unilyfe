import React, { Component } from 'react';
import logo from './logo.svg';
import NewSoc from './NewSociety/NewSociety.js'
import Feed from './Feed/Feed.js'
import './App.css';

class App extends Component {
    render() {
        return <div><NewSoc /><Feed /></div>
    }
}

export default App;
