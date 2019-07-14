import React from 'react';
import './App.css';
import { BrowserRouter as Router, Route} from 'react-router-dom'
import HomePageUser from './components/userhome/HomePageUser';
import HomePageLib from './components/librarianhome/HomePageLib';
import Login from './components/login/Login';
function App() {
  return (
    <Router>
      <div className="App">
        <Route exact path="/Home" component={HomePageUser}></Route>
        <Route exact path="/HomePageLib" component={HomePageLib}></Route>
        <Route exact path="/" component={Login}></Route>
      </div>
    </Router>
  );
}

export default App;
