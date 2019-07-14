import React, { Component } from 'react'

import Header from '../commons/Header';
import Footer from '../commons/Footer';
import Sidebarlibrarian from '../commons/Sidebarlibrarian';

export default class HomePageLib extends Component {
    render() {
        return (
            
            <div> 
       <Header/>
       <br/>
        <Sidebarlibrarian/>
        <br/>
        <Footer/>
             </div>
          
        )
    }
}
