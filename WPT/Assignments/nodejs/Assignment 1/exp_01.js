const express = require("express");
const app = express();
const path = require("path");
const m = require("./fun_01");

app.get("/", function (req, resp) {
  resp.sendFile(path.join(__dirname, "index_01.html"));
});
app.get("/submit-data", function (req, resp) {
  const a = parseInt(req.query.num1);
  const b = parseInt(req.query.num2);
  const c = req.query.num3.split(",").map(Number);
  const ans = m.addition(a, b);
  const ans2 = m.subtraction(a, b);
  const ans3 = m.multiplication(a, b);
  const ans4 = m.dividation(a, b);
  const ans5 = m.square(a);
  const ans6 = m.square(b);
  const ans7 = m.sum(...c);
  resp.send(
    `Addition: ${ans}<br>Subtraction: ${ans2}<br>Multiplication:v${ans3}<br>Dividsion: ${ans4}<br>Square of number1: ${ans5}<br> Square of number 2: ${ans6}<br>Sum of all numbers: ${ans7}`
  );
});
app.listen(3005, function () {
  console.log("server 3005");
});
