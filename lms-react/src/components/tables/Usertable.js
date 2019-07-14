import React, { Component } from 'react'

export default class usertable extends Component {
    render() {
        return (
            <div>
        <form action>
          <table className="table table-striped table-dark">
            <thead>
              <tr>
                <th scope="col">Book Id</th>
                <th scope="col">Book Name</th>
                <th scope="col">Accept</th>
                <th scope="col">Reject</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
        )
    }
}
