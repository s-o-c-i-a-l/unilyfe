import React, { Component } from 'react';
import './NewSocietyViewer.css';
import NewSociety from '../NewSociety/NewSociety.js'
import Slider from "react-slick";

const MTSocText = "Introducing the Musical Theatre Society (MTSoc), host of spectacular shows since 1956. Whether you're hungry for an opportunity to dazzle in the spotlight, jump into the pit as part of our incredible band or work behind the scenes with costume, make-up and tech, MTSoc invites you to join us and find your niche in one of the most exciting societies your university has to offer.";
const MTSocPhoto = "https://mtsoc.co.uk/img/revue2014.jpg";
const MTSocName = "Musical Theatre Society"

class NewSocietyViewer extends Component {
    joinSociety() {
        alert(`Joined ${this.societyName}!`);
    }
    render() {
        return (
            <div id="main-div" className="centered">
                <Slider>
                    <div><NewSociety societyText={MTSocText} societyPhoto={MTSocPhoto} societyName={MTSocName} /></div>
                </Slider>
                <button onClick={() => this.joinSociety(this.societyName)}>Join</button>
            </div>
        );
    }
}

export default NewSocietyViewer;
