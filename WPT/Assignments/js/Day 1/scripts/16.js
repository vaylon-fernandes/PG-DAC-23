var websites = [
  "www.google.com",
  "www.msn.com",
  "www.amazon.co.in",
  "in.answers.yahoo.com",
  "en.m.wikipedia.com",
  "codehs.gitbooks.io",
  "www.coderanch.com",
];

function searchWebsites() {
  var searchInput = document.getElementById("websiteInput").value;
  var count = 0;

  websites.forEach(function (website) {
    if (website.startsWith("www")) {
      count++;
    }
  });

  document.getElementById("result").textContent =
    "Total websites starting with 'www': " + count;
}
