fetch("http://localhost:8080/api/getUsername")
    .then(response => response.text())
    .then(username => {
        document.querySelector(".sidebar p").innerText = username;
    })

fetch("http://localhost:8080/api/getUsername")
    .then(response => response.json())
    .then(balance => {
        document.querySelector(".balance-section h2").innerText = `$${balance.toFixed(2)}`;
    })