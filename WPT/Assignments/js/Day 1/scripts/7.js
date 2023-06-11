function findMinimumNumber() {
  var numbers = document.getElementById("numbers").value;
  var numbersArray = numbers.split(",");

  var minimum = parseFloat(numbersArray[0]);

  for (var i = 1; i < numbersArray.length; i++) {
    var currentNumber = parseFloat(numbersArray[i]);

    if (currentNumber < minimum) {
      minimum = currentNumber;
    }
  }

  document.getElementById("output").innerHTML = "Minimum number: " + minimum;
}
