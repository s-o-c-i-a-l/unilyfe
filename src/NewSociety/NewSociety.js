import React, { Component } from 'react';
import './NewSociety.css';

class NewSociety extends Component {
    render() {
        return (
            <div id="main-div" className="centered">
                <div id="cover-photo-div" className="centered">
                    <img src={this.props.societyPhoto} alt="" id="cover-photo"></img>
                </div>
                <h2>{this.props.societyName}</h2>
                <p>{this.props.societyText}</p>
            </div>
        );
    }
}

export default NewSociety;
