$(document).ready(function () {
  $("#bookBtn").on("click", function (event) {
    event.preventDefault();

    var seats = parseInt($("#seats").val());
    if (seats > 0) {
      $("#memberInputs").empty();

      for (var i = 1; i <= seats; i++) {
        var input =
          '<label for="member' +
          i +
          '">Member ' +
          i +
          ":</label>" +
          '<input type="text" id="member' +
          i +
          '" name="member' +
          i +
          '" required><br><br>';

        $("#memberInputs").append(input);
      }

      $("#memberForm").show();
    }
  });

  $("#submitBtn").on("click", function (event) {
    event.preventDefault();
    var reservationDetails = {
      Name: $("#name").val(),
      Date: $("#date").val(),
      Seats: $("#seats").val(),
      Members: [],
    };

    for (var i = 1; i <= parseInt(reservationDetails.Seats); i++) {
      var memberName = $("#member" + i).val();
      reservationDetails.Members.push(memberName);
    }

    alert(JSON.stringify(reservationDetails));
  });
});
