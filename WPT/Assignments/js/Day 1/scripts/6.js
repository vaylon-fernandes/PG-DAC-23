function printDigitSum() {
  var number = document.getElementById("number").value;
  var sum = 0;

  if (number.length === 5) {
    for (var i = 0; i < number.length; i++) {
      sum += parseInt(number.charAt(i));
    }
    document.getElementById("output").innerHTML = "Sum of digits: " + sum;
  } else {
    document.getElementById("output").innerHTML =
      "Invalid input. Please enter a five-digit number.";
  }
}
