$(document).ready(function () {
  $("#showBtn").on("click", function () {
    var buttonText = $(this).text();

    // Toggle button text and show/hide image
    if (buttonText === "Show") {
      $(this).text("Hide");
      $("#myImage").show();
    } else {
      $(this).text("Show");
      $("#myImage").hide();
    }

    // Get selected radio button value
    var selectedRadio = $('input[name="radioBtn"]:checked').val();
    alert("Selected Radio Button: " + selectedRadio);
  });
});
