import React, { Component } from 'react';
import './Feed.css';

class Feed extends Component {
    constructor(userName) {
	    super();
	    this.userName = "Patrick";
    }	    
    render() {
        return (
		<div id="main-div" className="centered">
			<div id="fedd" className="centered">
            			<table>
  				<tr>
    					<th>Feed</th>
        				<th>Date</th>
 				</tr>
  				<tr>
    					<td>{this.userName} just joined Musical Theatre Soiety!</td>
    					<td>16:11 9.3.2019</td>
  				</tr>
  				<tr>
    					<td>Emily just joined Parkour Society!</td>
    					<td>15:39 9.3.2019</td>
  				</tr>
				</table>
			</div>
		</div>
        );
    }
}

export default Feed;

