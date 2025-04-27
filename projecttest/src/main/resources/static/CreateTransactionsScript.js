document.getElementById("scheduleTransactionForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form submission

    const transactionName = document.getElementById("transactionName").value;
    const transactionDate = document.getElementById("transactionDate").value;
    const transactionAmount = parseFloat(document.getElementById("transactionAmount").value);
    const transactionInterval = document.getElementById("transactionInterval").value;

    const scheduledTransaction = {
        name: transactionName,
        date: transactionDate,
        amount: transactionAmount,
        interval: transactionInterval
    };
    fetch("http://localhost:8080/api/getUsername")
    .then(response => response.text())
    .then(username => {
        document.querySelector(".sidebar p").innerText = username;
    })
    fetch("http://localhost:8080/api/TransactionTest", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(scheduledTransaction)
    })
    .then(response => response.text())
    .then(data => {
        document.getElementById("scheduleResponse").innerText = data;
        console.log("Complete!");
    })
    .catch(error => {
        console.error("Error scheduling transaction:", error);
        document.getElementById("scheduleResponse").innerText = "An error occurred. Please try again.";
    });
});