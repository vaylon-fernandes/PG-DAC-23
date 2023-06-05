var url = "https://en.wikipedia.org/w/api.php";

var params = {
  action: "query",
  format: "json",
  list: "random",
  rnlimit: "1",
  rnnamespace: "0",
};

url = url + "?origin=*";
Object.keys(params).forEach(function (key) {
  url += "&" + key + "=" + params[key];
});

$(function () {
  $("#btn").on("click", function () {
    console.log("in callback");

    $.ajax({
      async: true,
      url: `${url}`,
      success: function (result) {
        console.log(result);
        $(".content-card").show();
        $(".content-header").html(result.query.random[0].title);
        $(".intro").html(result.query.random[0].intro);
        $(".submit-btn").attr(
          "href",
          `https://en.wikipedia.org/wiki/${result.query.random[0].title}`
        );
      },
    });
  });
});
