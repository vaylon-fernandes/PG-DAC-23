$(document).ready(function () {
  // Change background color on focus
  $("#username").on("focus", function () {
    $(this).addClass("highlight");
  });

  // Validate on form submission
  $("#myForm").on("submit", function (event) {
    event.preventDefault();

    var username = $("#username").val();

    // Check if username starts with "An"
    if (username.startsWith("An")) {
      alert('Name starts with "An"');
      $(this).css("background-color", "cyan");
    } else {
      $(this).css("background-color", "");
    }
  });
});
