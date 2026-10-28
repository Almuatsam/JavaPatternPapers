# Java Pattern Papers

## Overview

This project contains 10 Java programming exercises focused on printing patterns using loops, conditional statements, and methods.

Each program reads input from the user and prints a pattern in the terminal.

## Exercises

| No. | Exercise | Description |
|---|---|---|
| 1 | Hollow Square | Prints a square with a hollow center. |
| 2 | Repeated Number Triangle | Prints each row number repeatedly. |
| 3 | Reverse Number Triangle | Prints decreasing numbers of values per row. |
| 4 | Full Diamond | Prints a diamond made of stars. |
| 5 | Hollow Diamond | Prints the outline of a diamond. |
| 6 | X Pattern | Prints an X inside a square. |
| 7 | Hourglass | Prints an hourglass made of stars. |
| 8 | Descending Alphabet Triangle | Prints letters in descending alphabetical order. |
| 9 | Odd Number Triangle | Prints consecutive odd numbers in a triangle. |
| 10 | Plus Sign | Prints a plus sign inside a square with an odd side length. |

## Project Structure

```text
JavaPatternPapers/
├── src/
│   ├── HollowSquare.java
│   ├── RepeatedNumberTriangle.java
│   ├── ReverseNumberTriangle.java
│   ├── FullDiamond.java
│   ├── HollowDiamond.java
│   ├── XPattern.java
│   ├── Hourglass.java
│   ├── DescendingAlphabetTriangle.java
│   ├── OddNumberTriangle.java
│   └── PlusSign.java
└── README.md
```

## Requirements

- Java Development Kit (JDK) 11 or later
- Git
- A terminal or Java-compatible IDE, such as Visual Studio Code

## How to Run

Clone the repository:

```bash
git clone https://github.com/Almuatsam/JavaPatternPapers.git
```

Navigate to the project directory:

```bash
cd JavaPatternPapers
```

Compile all Java programs:

```powershell
javac src\*.java
```

Run an individual program. For example, to run the Hollow Square exercise:

```powershell
java -cp src HollowSquare
```

To run another exercise, replace `HollowSquare` with the corresponding class name.

For example:

```powershell
java -cp src FullDiamond
```

Each program prompts the user to enter a value for `n`.

## Concepts Practiced

- Variables and data types
- User input with `Scanner`
- Nested `for` loops
- Conditional statements
- Boolean expressions
- Character arithmetic
- Methods and method parameters
- Pattern construction using rows, columns, spaces, and stars

## Author

Almuatsam

## Repository

[JavaPatternPapers on GitHub](https://github.com/Almuatsam/JavaPatternPapers)
