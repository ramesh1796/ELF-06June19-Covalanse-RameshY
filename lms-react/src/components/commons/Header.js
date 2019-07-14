import React, { Component } from 'react';
import {Link } from 'react-router-dom';
export default class Header extends Component {
    render() {
        return (
            <div>
        <div className="topnav">
          <ul>
            <li>
              <Link style={{color: 'white'}} href="#">Login</Link>
            </li>
            &nbsp;&nbsp;&nbsp;
            <li>
              <Link style={{color: 'white'}} href="#">Language</Link>
            </li>
            &nbsp;&nbsp;&nbsp;
            <li>
              <Link style={{color: 'white'}} href="#">Help</Link>
            </li>
            &nbsp;&nbsp;&nbsp;
            <li>
              <Link style={{color: 'white'}} href="/logout">Logout</Link>
            </li>
          </ul>
        </div>
        <nav className="navbar navbar-expand-lg navbar-light" style={{background: 'rgb(3, 78, 3)'}}>
          <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon" />
          </button>
          <Link className="navbar-brand" href="#" style={{color: 'white'}}>
            <img src="logo.JPG" width={65} height={65} style={{borderRadius: '50%'}} className="d-inline-block align-top" alt="" />
            <b style={{position: 'relative', bottom: '-17px'}}> Library Management</b>
          </Link>
          <div className="collapse navbar-collapse" id="navbarTogglerDemo03" style={{marginLeft: '200px'}}>
            <ul className="navbar-nav mr-auto mt-2 mt-lg-0">
              <li className="nav-item active">
                <Link style={{color: 'white'}} className="nav-link" href="#">Home <span className="sr-only">(current)</span></Link>
              </li>
              <li className="nav-item">
                <Link style={{color: 'white'}} className="nav-link" href="#">About</Link>
              </li>
              <li className="nav-item">
                <Link style={{color: 'white'}} className="nav-link" href="#">Gallery</Link>
              </li>
            </ul>
            <form className="form-inline my-2 my-lg-0">
              <input style={{}} className="form-control mr-sm-2" type="search" placeholder="Search by Category/Author/BookName" aria-label="Search" />
              <button className="btn btn-success my-2 my-sm-0" type="submit">Search Book</button>
            </form>
          </div>
        </nav>
      </div>
        )
    }
}
