function calculatePayment(event) {
  event.preventDefault();

  var loanAmountInput = document.getElementById("loanAmountInput");
  var repaymentPeriodInput = document.getElementById("repaymentPeriodInput");
  var totalInterestPayments = document.getElementById("totalInterestPayments");

  var loanAmount = parseInt(loanAmountInput.value);
  var repaymentPeriod = parseInt(repaymentPeriodInput.value);

  if (loanAmount > 1500000 || repaymentPeriod < 7 || repaymentPeriod > 15) {
    alert("Invalid loan information. Please check the constraints.");
    return;
  }

  // Calculate total interest payments based on loan information
  var totalInterest = loanAmount * (repaymentPeriod - 6) * 0.08;
  totalInterestPayments.value = totalInterest.toFixed(2);
}
