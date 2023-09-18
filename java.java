<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaScript Concepts</title>
</head>
<body>
    <h2>JavaScript Output</h2>
    <div id="output"></div>

    <script>
        // Function to display output on the webpage
        function displayOutput(outputText) {
            const outputElement = document.getElementById('output');
            outputElement.innerHTML += `<p>${outputText}</p>`;
        }

        // a. String methods
        const str = "Hello, World!";
        displayOutput(`Length of the string: ${str.length}`);
        displayOutput(`Convert to uppercase: ${str.toUpperCase()}`);
        displayOutput(`Convert to lowercase: ${str.toLowerCase()}`);
        displayOutput(`Find the index of 'World': ${str.indexOf("World")}`);
        displayOutput(`Split the string: ${str.split(", ").join(', ')}`);

        // b. Number methods
        const num = 42.5678;
        displayOutput(`Round to 2 decimal places: ${num.toFixed(2)}`);
        displayOutput(`Convert to a string: ${num.toString()}`);
        displayOutput(`Is NaN? ${Number.isNaN(num)}`);
        displayOutput(`Round down to the nearest integer: ${Math.floor(num)}`);
        displayOutput(`Generate a random number: ${Math.random()}`);

        // c. Array methods
        const myArray = [1, 2, 3, 4, "five", 6, "seven"];
        displayOutput(`Length of the array: ${myArray.length}`);
        displayOutput(`Join array elements: ${myArray.join(", ")}`);
        displayOutput(`Extract a sub-array: ${myArray.slice(1, 4).join(', ')}`);
        displayOutput(`Find the index of 'five': ${myArray.indexOf("five")}`);
        displayOutput(`Concatenate arrays: ${myArray.concat([8, 9]).join(', ')}`);

        // d. Date methods
        const today = new Date();
        displayOutput(`Date in a readable format: ${today.toDateString()}`);
        displayOutput(`Get the year: ${today.getFullYear()}`);
        displayOutput(`Get the month (0-11): ${today.getMonth()}`);
        displayOutput(`Get the day of the month: ${today.getDate()}`);
        displayOutput(`Get the hour: ${today.getHours()}`);

        // e. Function Methods
        function greet(name) {
            displayOutput(`Hello, ${name}!`);
        }
        const sayHello = greet;
        sayHello("John");

        function add(a, b) {
            return a + b;
        }
        const result = add(5, 3);
        displayOutput(`Addition result: ${result}`);
    </script>
</body>
</html>
