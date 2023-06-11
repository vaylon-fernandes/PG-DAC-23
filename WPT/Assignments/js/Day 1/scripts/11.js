function getWeekDay(date) {
  var weekdays = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
  return weekdays[date.getDay()];
}

function displayWeekday() {
  var date = new Date(2012, 0, 3); // January is represented by index 0
  var weekday = getWeekDay(date);
  alert(weekday);
}
