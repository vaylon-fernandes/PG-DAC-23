$(function () {
  // load on ready
  $("#btn").on("click", function () {
    $.ajax({
      url: "https://en.wikipedia.org/w/api.php",
      data: {
        action: "query",
        format: "json",
        generator: "random",
        grnnamespace: 0,
        prop: "extracts",
        exintro: true,
        explaintext: true,
      },
      dataType: "jsonp",
      success: function (response) {
        console.log(response);
        const pages = response.query.pages;
        const pageId = Object.keys(pages)[0];
        const title = pages[pageId].title;
        const intro = pages[pageId].extract;
        const wikiLink =
          "https://en.wikipedia.org/wiki/" + title.replace(/ /g, "_");
        $(".content-card").show();
        $(".content-header").html(title);
        $(".intro").html(intro);
        $(".submit-btn").attr(
          "href",
          `https://en.wikipedia.org/wiki/${wikiLink}`
        );
      },
    });
  });
});
