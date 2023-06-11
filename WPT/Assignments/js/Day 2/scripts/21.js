var memberNames = ["John", "Jane", "Mark", "Sarah", "David"];

window.onload = function () {
  var memberList = document.getElementById("memberList");

  memberNames.forEach(function (name) {
    var listItem = document.createElement("li");
    listItem.textContent = name;
    memberList.appendChild(listItem);
  });
};
