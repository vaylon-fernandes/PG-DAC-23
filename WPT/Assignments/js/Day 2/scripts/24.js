function validateLogin(event) {
  event.preventDefault();

  var usernameInput = document.getElementById("usernameInput");
  var passwordInput = document.getElementById("passwordInput");

  var username = usernameInput.value;
  var password = passwordInput.value;

  // Validate username
  if (!username.match(/^[a-zA-Z]{6,10}$/)) {
    alert(
      "Invalid username. Username must be between 6 to 10 characters and contain only alphabetic characters."
    );
    return;
  }

  // Validate password
  if (!password.match(/^(?=.*\d)(?=.*#)[a-zA-Z0-9#]{9,}$/)) {
    alert(
      "Invalid password. Password should be greater than 8 characters, must contain a '#' and at least one digit."
    );
    return;
  }

  // Login successful
  alert("Login successful!");
}
