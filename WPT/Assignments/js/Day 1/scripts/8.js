function pow(x, y) {
  var result = 1;

  for (var i = 0; i < y; i++) {
    result *= x;
  }

  return result;
}

function calculatePower() {
  var base = parseFloat(document.getElementById("base").value);
  var exponent = parseInt(document.getElementById("exponent").value);
  var result = pow(base, exponent);

  document.getElementById("output").innerHTML = "Result: " + result;
}
