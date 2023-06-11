const fs = require("fs");

fs.readFile("mydata.txt", function (err, data) {
  if (err) {
    console.log("error occured", err);
  } else {
    console.log("first file : " + data.toString().split(" ").length);
  }
});

fs.readFile("myfile.txt", function (err, data) {
  if (err) {
    console.log("error occured", err);
  } else {
    console.log("second file : " + data.toString().split(" ").length);
  }
});
