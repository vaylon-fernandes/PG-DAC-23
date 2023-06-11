function calculateCompoundInterest() {
  var principal = parseFloat(document.getElementById("principal").value);
  var rate = parseFloat(document.getElementById("rate").value);
  var years = parseInt(document.getElementById("years").value);

  var flag1 = validatePrincipal(principal);
  var flag2 = validateRate(rate);
  var flag3 = validateYears(years);
  //   console.log(flag1, flag2, flag3);
  if (flag1 || flag2 || flag3) {
    document.getElementById("output").innerHTML =
      "Invalid input. Please enter valid values.";
  } else {
    var compoundInterest =
      principal * Math.pow(1 + rate / 100, years) - principal;
    document.getElementById("output").innerHTML =
      "Compound Interest: " + compoundInterest.toFixed(2);
  }
}

function validatePrincipal(principal) {
  if (isNaN(principal) || principal <= 0) {
    return true;
  }
  return false;
}

function validateRate(rate) {
  if (isNaN(rate) || rate <= 0) {
    return true;
  }
  return false;
}

function validateYears(years) {
  if (isNaN(years) || years <= 0) {
    return true;
  }
  return false;
}
