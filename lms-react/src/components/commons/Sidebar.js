import React, { Component } from 'react'

export default class Sidebar extends Component {
    render() {
        return (
            <div>
                <div className="container-fluid">
                    <div className="row">
                        <div className="col-md-2 col-sm-4 sidebar1">
                            <div className="logo">
                                <img src="http://lorempixel.com/output/people-q-g-64-64-1.jpg" className="img-responsive center-block" alt="Logo" />
                            </div>
                            <br />
                            <div className="left-navigation">
                                <ul className="list">
                                    <h5><strong>Library Details</strong></h5>
                                    <li><a href="#" style={{ alignContent: 'center' }}>Book list</a></li>
                                    <li><a href="#" style={{ alignContent: 'center' }}>Borrowed Books</a></li>
                                    <li><a href="#" style={{ alignContent: 'center' }}>Booking Status</a></li>
                                    <li><a href="#" style={{ alignContent: 'center' }}>Upload a photo</a></li>
                                </ul>
                                <br />
                                <ul className="list">
                                    <h5><strong>My Account</strong></h5>
                                    <li><a href="#">Edit Profile</a></li>
                                    <li><a href="#">Change Password</a></li>
                                    <li><a href="#">Contacts</a></li>
                                    <br />
                                    <li><a href="#">Settings</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
