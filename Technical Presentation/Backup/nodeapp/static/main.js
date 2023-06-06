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
      url: "https://en.wikipedia.org/wiki/Special:Random",
      dataType: "html",

      success: function (result) {
        const $html = $(response);
        const title = $html.find("#firstHeading").text();
        const intro = $html
          .find("#mw-content-text p:not(.mw-empty-elt)")
          .first()
          .text();
        const wikiLink =
          "https://en.wikipedia.org/wiki/" + title.replace(/ /g, "_");
        $(".content-card").show();
        $(".content-header").html(title);
        $(".intro").html(intro);
        $(".submit-btn").attr("href", wikiLink);
      },
    });
  });
});
