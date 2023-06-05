exports.factorial = function (n) {
  let fact = 1;
  for (i = 1; i <= n; i++) {
    fact = fact * i;
  }
};

exports.myprime = function (n) {
  if (num < 2) {
    return false;
  }
  if (num == 2) {
    return true;
  } else {
    for (i = 3; i * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
};

exports.printable = function (n) {
  arr = new Array();
  for (i = 1; i <= 10; i++) {
    arr.push(`<p>${n}*${i}=${n * i}</p><br>`);
  }
  return arr;
};
