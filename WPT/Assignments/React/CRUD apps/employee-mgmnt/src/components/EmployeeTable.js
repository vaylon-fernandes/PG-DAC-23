import React from "react";
import { Link } from "react-router-dom";
import EmployeeService from "../service/EmployeeService";
class EmployeeTable extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      earr: [],
      searcharr: [],
      searchtext: "",
    };
  }
  fetchdata = () => {
    EmployeeService.getEmployees().then((result) => {
      console.log(result.data);
      this.setState({
        ...this.state,
        earr: result.data,
        searcharr: result.data,
      });
    });
  };
  componentDidMount() {
    console.log("In mount");
    this.fetchdata();
  }
  deleteEmp = (id) => {
    EmployeeService.deleteById(id)
      .then(() => {
        //after delete, send request to webservice to get new list of employees
        this.fetchdata();
      })
      .catch();
  };
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-sm-12 col-md-6">
            <Link to="/form">
              <button
                type="button"
                name="btn"
                id="btn"
                className="btn btn-success"
              >
                Add New Employee
              </button>
              <br />
              <br />
            </Link>
            <input type="text" name="nm" id="nm" />
            <br />
            <br />
            <table className="table table-striped">
              <thead>
                <tr>
                  <th scope="col">Employee Id</th>
                  <th scope="col">Employee Name</th>
                  <th scope="col">Employee Salary</th>
                  <th scope="col">Actions</th>
                </tr>
              </thead>
              <tbody>
                {this.state.searcharr.map((emp) => (
                  <tr key={emp.empid}>
                    <td>{emp.empid}</td>
                    <td>{emp.name}</td>
                    <td>{emp.sal}</td>
                    <td>
                      <button
                        className="btn btn-danger"
                        type="button"
                        name="edit-btn"
                        onClick={() => {
                          this.deleteEmp(emp.empid);
                        }}
                      >
                        <svg
                          xmlns="http://www.w3.org/2000/svg"
                          width="16"
                          height="16"
                          fill="currentColor"
                          className="bi bi-trash3-fill"
                          viewBox="0 0 16 16"
                        >
                          <path d="M11 1.5v1h3.5a.5.5 0 0 1 0 1h-.538l-.853 10.66A2 2 0 0 1 11.115 16h-6.23a2 2 0 0 1-1.994-1.84L2.038 3.5H1.5a.5.5 0 0 1 0-1H5v-1A1.5 1.5 0 0 1 6.5 0h3A1.5 1.5 0 0 1 11 1.5Zm-5 0v1h4v-1a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5ZM4.5 5.029l.5 8.5a.5.5 0 1 0 .998-.06l-.5-8.5a.5.5 0 1 0-.998.06Zm6.53-.528a.5.5 0 0 0-.528.47l-.5 8.5a.5.5 0 0 0 .998.058l.5-8.5a.5.5 0 0 0-.47-.528ZM8 4.5a.5.5 0 0 0-.5.5v8.5a.5.5 0 0 0 1 0V5a.5.5 0 0 0-.5-.5Z" />
                        </svg>
                      </button>
                      &nbsp;&nbsp;&nbsp;
                      <button className="btn btn-primary">
                        <svg
                          xmlns="http://www.w3.org/2000/svg"
                          width="16"
                          height="16"
                          fill="currentColor"
                          className="bi bi-pen-fill"
                          viewBox="0 0 16 16"
                        >
                          <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001z" />
                        </svg>
                      </button>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    );
  }
}

export default EmployeeTable;
