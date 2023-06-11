function listEvenNumbers() {
  var n = parseInt(document.getElementById("number").value);
  var output = "";
  var i = 0;

  while (i <= n) {
    if (i % 2 === 0) {
      output += i + "<br>";
    }
    i++;
  }

  document.getElementById("output").innerHTML = output;
}
