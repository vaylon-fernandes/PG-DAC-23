function printMessage() {
  var number = parseInt(document.getElementById("number").value);
  var message = document.getElementById("message").value;
  var output = "";

  for (var i = 0; i < number; i++) {
    output += message + "<br>";
  }

  document.getElementById("output").innerHTML = output;
}
