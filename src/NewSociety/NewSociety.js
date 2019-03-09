import React, { Component } from 'react';
import './NewSociety.css';
import { join } from 'upath';

class NewSociety extends Component {
    constructor(societyName) {
        super();
        this.societyName = "Musical Theatre Society";
    }
    joinSociety() {
        alert(`Joined ${this.societyName}!`);
    }
    render() {
        return (
            <div id="main-div" className="centered">
                <div id="cover-photo-div" className="centered">
                    <img src="https://mtsoc.co.uk/img/revue2014.jpg" id="cover-photo"></img>
                </div>
                <h2>Musical Theatre Society</h2>
                <button onClick={() => this.joinSociety(this.societyName)}>Join</button>
            </div>
        );
    }
}

export default NewSociety;
