$(document).ready(function () {
  // set color
  $("#setColor").click(function () {
    $(".container").css("background-color", "red");
  });
  // set properties
  $("#setProps").click(function () {
    $(".container").css({
      "background-color": "yellow",
      "font-size": "50px",
    });
  });

  // add class
  $("#addClass").click(function () {
    $(".container").addClass("underline");
  });

  // remove class
  $("#removeClass").click(function () {
    $(".container").removeClass("underline");
  });

  //toggle class
  $("#toggleClass").click(function () {
    $(".container").toggleClass("underline");
  });

  // set width
  $("#setWidth").click(function () {
    $(".container").width(300);
  });
  // set height
  $("#setHeight").click(function () {
    $(".container").height(300);
  });
  // show
  $("#show").click(function () {
    $(".container").show();
  });
  // hide
  $("#hide").click(function () {
    $(".container").hide();
  });
  $("#fadeIn").click(function () {
    $(".container").fadeIn();
  });

  $("#fadeOut").click(function () {
    $(".container").fadeOut();
  });

  $("#slideUp").click(function () {
    $(".container").slideUp();
  });

  $("#slideDown").click(function () {
    $(".container").slideDown();
  });

  $("#animate").click(function () {
    $(".container").animate({ "margin-left": "100px", width: "300px" }, 800);
  });
});
