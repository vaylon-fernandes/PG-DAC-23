$(document).ready(function () {
  $("#showBtn").on("click", function () {
    var buttonText = $(this).html();

    // Toggle button text and show/hide image
    if (buttonText === "Show") {
      $(this).html("Hide"); // this: fires event on element that is interacted with
      $("#myImage").show();
    } else {
      $(this).html("Show");
      $("#myImage").hide();
    }

    // Get selected radio button value
    var selectedRadio = $('input[name="radioBtn"]:checked').val(); //:checked selects radio button that is checked
    alert("Selected Radio Button: " + selectedRadio);
  });
});
