<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JavaScript Concepts</title>
</head>
<body>
    <script>
        // a. String methods
        const str = "Hello, World!";
        console.log(str.length); // Length of the string
        console.log(str.toUpperCase()); // Convert to uppercase
        console.log(str.toLowerCase()); // Convert to lowercase
        console.log(str.indexOf("World")); // Find the index of a substring
        console.log(str.split(", ")); // Split the string into an array

        // b. Number methods
        const num = 42.5678;
        console.log(num.toFixed(2)); // Round to 2 decimal places
        console.log(num.toString()); // Convert to a string
        console.log(Number.isNaN(num)); // Check if it's NaN
        console.log(Math.floor(num)); // Round down to the nearest integer
        console.log(Math.random()); // Generate a random number between 0 and 1

        // c. Array methods
        const myArray = [1, 2, 3, 4, "five", 6, "seven"];
        console.log(myArray.length); // Length of the array
        console.log(myArray.join(", ")); // Join array elements into a string
        console.log(myArray.slice(1, 4)); // Extract a sub-array
        console.log(myArray.indexOf("five")); // Find the index of an element
        console.log(myArray.concat([8, 9])); // Concatenate arrays

        // d. Date methods
        const today = new Date();
        console.log(today.toDateString()); // Date in a readable format
        console.log(today.getFullYear()); // Get the year
        console.log(today.getMonth()); // Get the month (0-11)
        console.log(today.getDate()); // Get the day of the month
        console.log(today.getHours()); // Get the hour

        // e. Function Methods
        function greet(name) {
            console.log(`Hello, ${name}!`);
        }
        const sayHello = greet;
        sayHello("John");

        function add(a, b) {
            return a + b;
        }
        const result = add(5, 3);
        console.log(result);
    </script>
</body>
</html>
