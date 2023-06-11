function calculateCircle(event) {
  event.preventDefault();

  var radiusInput = document.getElementById("radiusInput");
  var radius = parseFloat(radiusInput.value);

  var area = Math.PI * Math.pow(radius, 2);
  var circumference = 2 * Math.PI * radius;

  document.getElementById("resultArea").textContent =
    "Area: " + area.toFixed(2);
  document.getElementById("resultCircumference").textContent =
    "Circumference: " + circumference.toFixed(2);
}
