import React, { Component } from 'react'
import {Link } from 'react-router-dom';
export default class Footer extends Component {
    render() {
        return (
            <div>
                <footer className="section footer-classic context-dark bg-image" style={{ background: 'rgb(3, 78, 3)' }}>
                    <div className="container">
                        <div className="row row-30">
                            <div className="col-md-4 col-xl-5">
                                <div className="pr-xl-4"><Link className="brand" href="index.html">Library </Link>
                                    <p>We are an award-winning creative agency, dedicated to the best result in web design, promotion, business consulting, and marketing.</p>
                                   
                                    <p className="rights"><span>©&nbsp; </span><span className="copyright-year">2018</span><span>&nbsp;</span><span>Waves</span><span>.&nbsp;</span><span>All Rights Reserved.</span></p>
                                </div>
                            </div>
                            <div className="col-md-4">
                                <h5>Contacts</h5>
                                <dl className="contact-list">
                                    <dt>Address:</dt>
                                    <dd>798 South Park Avenue, Jaipur, Raj</dd>
                                </dl>
                                <dl className="contact-list">
                                    <dt>email:</dt>
                                    <dd><Link href="mailto:#">library@gmail.com</Link></dd>
                                </dl>
                                <dl className="contact-list">
                                    <dt>phones:</dt>
                                    <dd><Link href="tel:#">+91 7568543012</Link> <span>or</span> <Link href="tel:#">+91 9571195353</Link>
                                    </dd>
                                </dl>
                            </div>
                            <div className="col-md-4 col-xl-3">
                                <h5>Links</h5>
                                <ul className="nav-list">
                                    <li><Link href="#">About</Link></li>
                                    <li><Link href="#">Gallery</Link></li>
                                    <li><Link href="#">Library</Link></li>
                                    <li><Link href="#">Contacts</Link></li>
                                    <li><Link href="#">Help</Link></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div className="row no-gutters social-container">
                        <div className="col"><Link className="social-inner" href="#"><span className="icon mdi mdi-facebook" /><span>Facebook</span></Link></div>
                        <div className="col"><Link className="social-inner" href="#"><span className="icon mdi mdi-instagram" /><span>instagram</span></Link></div>
                        <div className="col"><Link className="social-inner" href="#"><span className="icon mdi mdi-twitter" /><span>twitter</span></Link></div>
                        <div className="col"><Link className="social-inner" href="#"><span className="icon mdi mdi-youtube-play" /><span>google</span></Link></div>
                    </div>
                </footer>
            </div>
        )
    }
}
