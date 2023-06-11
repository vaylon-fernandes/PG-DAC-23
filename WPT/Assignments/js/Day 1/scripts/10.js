function getCurrentDate() {
  var currentDate = new Date();
  var options = {
    weekday: "long",
    year: "numeric",
    month: "long",
    day: "numeric",
  };
  var formattedDate = currentDate.toLocaleDateString("en-US", options);
  return formattedDate;
}

function getGreeting() {
  var currentTime = new Date();
  var currentHour = currentTime.getHours();

  if (currentHour < 12) {
    return "Good morning!";
  } else if (currentHour < 18) {
    return "Good afternoon!";
  } else {
    return "Good evening!";
  }
}

function getDaysLeft() {
  var currentDate = new Date();
  var currentYear = currentDate.getFullYear();
  var endOfYear = new Date(currentYear, 11, 31); // December is represented by index 11
  var daysLeft = Math.ceil((endOfYear - currentDate) / (1000 * 60 * 60 * 24));
  return daysLeft;
}

function display() {
  document.getElementById("date").innerHTML = "Today is " + getCurrentDate();
  document.getElementById("greeting").innerHTML =
    "Welcome, and " + getGreeting() + " to You.";
  document.getElementById("daysLeft").innerHTML =
    "Number of days left till end of year: " + getDaysLeft();
}
