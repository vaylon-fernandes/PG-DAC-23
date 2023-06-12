$(document).ready(function () {
  $("#showBtn").on("click", function (event) {
    event.preventDefault();
    var buttonText = $(this).html();

    // Toggle button text and show/hide image
    if (buttonText === "Show") {
      $(this).html("Hide");
      $("#myImage").show();
    } else {
      $(this).html("Show");
      $("#myImage").hide();
    }

    // Get selected radio button value
    var selectedRadio = $('input[name="radioBtn"]:checked').val();
    alert("Selected Radio Button: " + selectedRadio);
  });
});
