function calculateSum(event) {
  event.preventDefault();

  var numberInput = document.getElementById("numberInput");
  var number = parseInt(numberInput.value);

  if (number <= 0 || number >= 1000) {
    document.getElementById("result").textContent =
      "Entered number is out of range";
    return;
  }

  var sum = 0;
  var digits = number.toString().split("");

  digits.forEach(function (digit) {
    sum += parseInt(digit);
  });

  document.getElementById("result").textContent =
    "Sum of the digits of " + number + " is " + sum;
}
