function stringOperation() {
  alert("call");

  var a = document.getElementById("str1").value;
  var b = document.getElementById("str2").value;
  var c = document.getElementById("str3").value;
  alert(a + " " + b + " " + c);
  var result = "";
  var op = document.getElementsByName("string");
  for (var i = 0; i < op.length; i++) {
    if (op[i].checked) {
      var data = op[i].value;
    }
  }
  alert(data);
  switch (data) {
    case "search":
      result = a.search(b);
      break;
    case "upper":
      result = a.toUpperCase();
      break;
    case "lower":
      result = a.toLowerCase();
      break;
    case "trim":
      result = a.trim();
      break;
    case "concat":
      result = a.concat(b);
      break;
    case "replace":
      result = a.replace(b, c);
      break;
  }
  document.getElementById("mydiv").innerHTML = result;
}

function disableText() {
  var replaceRadio = document.getElementById("replace");
  var replaceText = document.getElementById("str3");

  if (replaceRadio.checked) {
    replaceText.disabled = false;
  } else {
    replaceText.disabled = true;
  }
}
