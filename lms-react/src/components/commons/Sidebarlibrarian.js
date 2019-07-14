import React, { Component } from 'react'
import {Link } from 'react-router-dom';
export default class sidebarlibrarian extends Component {
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
                                    <li><Link href="#" style={{ alignContent: 'center' }}>Book list</Link></li>
                                    <li><Link href="#" style={{ alignContent: 'center' }}>View Request</Link></li>
                                    <li><Link href="#" style={{ alignContent: 'center' }}>Add Book</Link></li>
                                    <li><Link href="#" style={{ alignContent: 'center' }}>Update Book</Link></li>
                                    <li><Link href="#" style={{ alignContent: 'center' }}>Remove Book</Link></li>
                                </ul>
                                <br />
                                <ul className="list">
                                    <h5><strong>My Account</strong></h5>
                                    <li><Link href="#">Edit Profile</Link></li>
                                    <li><Link href="#">Change Password</Link></li>
                                    <li><Link href="#">Contacts</Link></li>
                                    <br />
                                    <li><Link href="#">Settings</Link></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

