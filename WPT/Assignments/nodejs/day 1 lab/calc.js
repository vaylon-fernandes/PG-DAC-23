exports.add = function (a, b) {
  return a + b;
};

exports.subtract = function (a, b) {
  return a - b;
};

exports.multiply = function (a, b) {
  return a * b;
};

exports.divide = function (a, b) {
  return a / b;
};

exports.square = function (a) {
  return a * a;
};

exports.sum = function (...a) {
  var sum = a.reduce(function (x, y) {
    return x + y;
  }, 0);
  return sum;
};
