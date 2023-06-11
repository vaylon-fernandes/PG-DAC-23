function printMultiplicationTable() {
  var number = parseInt(document.getElementById("number").value);
  var output = "";

  for (var i = 1; i <= 10; i++) {
    var result = number * i;
    output += number + " * " + i + " = " + result + "<br>";
  }

  document.getElementById("output").innerHTML = output;
}
