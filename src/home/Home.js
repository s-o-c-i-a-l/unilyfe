import React, {Component} from 'react';
import SideBar from './sidebar.js';

import './Home.css';

class Home extends Component{
  constructor(){
    super();
    this.profile = "./image/profile.png";
    this.main = "../image/main.png";
  }
  render(){
    return (
    <div id="App">
      <SideBar />
      <div id="page-wrap">
        <img src={require('../image/profile.png')} alt="Profile" class="Profile"/>
        <h2 class="name">Blair Shi</h2>
        <img src={require('../image/main.png')} alt="Main" class="Main"/>
      </div>
    </div>
    )
  }
}

export default Home;
