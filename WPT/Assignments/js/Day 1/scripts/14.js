function Rectangle(width, height) {
  this.width = width;
  this.height = height;
  this.area = function () {
    return this.width * this.height;
  };
  this.perimeter = function () {
    return 2 * (this.width + this.height);
  };
}

function Circle(radius) {
  this.radius = radius;
  this.area = function () {
    return Math.PI * this.radius * this.radius;
  };
  this.circumference = function () {
    return 2 * Math.PI * this.radius;
  };
}

function createRectangle() {
  var widthInput = document.getElementById("rectangleWidth");
  var heightInput = document.getElementById("rectangleHeight");

  var width = parseFloat(widthInput.value);
  var height = parseFloat(heightInput.value);

  var rectangle = new Rectangle(width, height);

  document.getElementById("rectangleDimensions").innerHTML =
    "Dimensions: " + width + "x" + height;
  document.getElementById("rectangleArea").innerHTML =
    "Area: " + rectangle.area();
  document.getElementById("rectanglePerimeter").innerHTML =
    "Perimeter: " + rectangle.perimeter();
}

function createCircle() {
  var radiusInput = document.getElementById("circleRadius");
  var radius = parseFloat(radiusInput.value);

  var circle = new Circle(radius);

  document.getElementById("circleDimensions").innerHTML =
    "Dimensions: Radius " + radius;
  document.getElementById("circleArea").innerHTML = "Area: " + circle.area();
  document.getElementById("circleCircumference").innerHTML =
    "Circumference: " + circle.circumference();
}
