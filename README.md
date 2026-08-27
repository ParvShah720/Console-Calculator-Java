# Java Calculator

A simple command-line calculator built using Java.  
The program allows users to perform basic arithmetic operations repeatedly until they choose to exit.

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Supports multiple calculations using a loop
- Handles invalid menu input using exception handling
- Prevents division by zero using `ArithmeticException`
- Displays results up to 2 decimal places

## Concepts Used

- Java Methods
- Scanner class for user input
- While loop
- Switch-case statements
- Exception Handling
    - `InputMismatchException`
    - `ArithmeticException`
- Static methods
- Formatted output using `printf()`

## How to Run

### 1. Clone the repository

```bash
git clone <https://github.com/ParvShah720/Console-Calculator-Java.git>
```

### 2. Navigate to the project folder

```bash
cd Calculator
```

### 3. Compile the Java file

```bash
javac Calculator.java
```

### 4. Run the program

```bash
java Calculator
```

## Example Output

```
Calculator
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit

Choose operation: 4

Enter first number: 10
Enter second number: 3

Result: 3.33
```

## Error Handling Example

### Invalid Input

```
Choose operation: abc

Invalid input! Please enter a valid whole number.
```

### Division By Zero

```
Enter first number: 10
Enter second number: 0

Division by zero is not possible!
```


## Author

Parv Shah
