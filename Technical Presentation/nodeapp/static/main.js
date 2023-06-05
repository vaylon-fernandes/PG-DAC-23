// const contentCard = document.querySelector(".content-card");
// const title = document.querySelector(".content-header");
// const intro = document.querySelector(".intro");
// const link = document.querySelector(".submit-btn");

// alert("hello");
// const loadDiv = () => {
//   fetch(`http://127.0.0.1:5000/getArticle`, {}).then(function (response) {
//     response.json().then(function (data) {
//       if (contentCard.style.display !== "block") {
//         contentCard.style.display = "block";
//       }
//       title.innerHTML = data.title;
//       intro.innerHTML = data.intro;
//       link.href = data.link;
//     });
//   });
// };

$(document).ready(function () {
  $("#btn").click(function () {
    $.ajax({
      async: true,
      url: `${window.origin}/getArticle`,
      success: function (result) {
        $(".content-card").show();
        $(".content-header").html(result.title);
        $(".intro").html(result.intro);
        $(".submit-btn").attr("href", result.link);
      },
    });
  });
});
