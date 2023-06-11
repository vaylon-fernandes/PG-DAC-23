var employees = [];

function addEmployee() {
  var nameInput = document.getElementById("name");
  var employeeName = nameInput.value.trim();

  if (employeeName !== "") {
    employees.push(employeeName);
    nameInput.value = "";
    nameInput.focus();
    displayEmployees();
  }
}

function displayEmployees() {
  var employeeList = document.getElementById("employeeList");
  employeeList.innerHTML = "";

  for (var i = 0; i < employees.length; i++) {
    var listItem = document.createElement("li");
    listItem.textContent = employees[i];
    employeeList.appendChild(listItem);
  }
}

function displaySortedNames() {
  var sortedNames = employees.slice().sort();
  var employeeList = document.getElementById("employeeList");
  employeeList.innerHTML = "";

  for (var i = 0; i < sortedNames.length; i++) {
    var listItem = document.createElement("li");
    listItem.textContent = sortedNames[i];
    employeeList.appendChild(listItem);
  }
}
