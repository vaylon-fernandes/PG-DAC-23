var employees = [
  { empid: 1, empname: "John Doe", salary: 5000 },
  { empid: 2, empname: "Jane Smith", salary: 6000 },
  { empid: 3, empname: "Michael Johnson", salary: 5500 },
  { empid: 4, empname: "Emily Williams", salary: 6500 },
];

function displayEmployeeDetails() {
  var tableBody = document.getElementById("employeeTableBody");
  tableBody.innerHTML = "";

  employees.forEach(function (employee) {
    var row = document.createElement("tr");

    var empIdCell = document.createElement("td");
    empIdCell.textContent = employee.empid;
    row.appendChild(empIdCell);

    var empNameCell = document.createElement("td");
    empNameCell.textContent = employee.empname;
    row.appendChild(empNameCell);

    var salaryCell = document.createElement("td");
    salaryCell.textContent = employee.salary;
    row.appendChild(salaryCell);

    tableBody.appendChild(row);
  });
}

// displayEmployeeDetails();
