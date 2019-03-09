import React, {Component} from 'react';
import SideBar from './sidebar.js';

import './Home.css';

class Home extends Component{
  constructor(){
    super();
    this.profile = "./image/profile.png";
  }
  render(){
    return (
    <div id="App">
      <SideBar />
      <div id="page-wrap">
        <img src={require('../image/profile.png')} alt="Profile" class="Profile"/>
        <h2 class="name">Blair Shi</h2>
      </div>
      <div class="first-row">
        <div class="first-column">
          <h3> My Society</h3>
        </div>
        <div class="pedding-column">
        </div>
        <div class="second-column">
          <h3> Monthly Calendar</h3>
        </div>
      </div>
    </div>
    )
  }
}

export default Home;
