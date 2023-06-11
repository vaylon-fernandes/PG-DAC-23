var words = ["hello", "world", "javascript", "programming", "openai"];

function reverseWords() {
  var reversedWords = words.map(function (word) {
    return word.split("").reverse().join("");
  });

  var sortedWords = reversedWords.sort();

  document.getElementById("wordsDisplay").textContent = words.join(", ");
  document.getElementById("reversedDisplay").textContent =
    reversedWords.join(", ");
  document.getElementById("sortedDisplay").textContent = sortedWords.join(", ");
}
