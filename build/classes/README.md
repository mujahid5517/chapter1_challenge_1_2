# 🏆 Lottery Number Analyzer (Chapter 1, Challenge 1.2)
This is an individual Java project developed by a Computer Science student to implement the **`LotteryAnalyzer`** utility.

---

## 🎯 Project Overview: The Lottery Number Analyzer (Arrays & Strings)
This project addresses **Challenge 1.2 from Chapter 1**. The goal is to process and analyze a pre-defined array of lottery ticket strings. Each ticket is formatted with dashes (e.g., `"XX-XX-..."`) and is analyzed to find the ticket with the **highest average digit value**.

### Key Program Steps
The Java implementation performs the following core steps:

1.  **Ticket Iteration:** An **enhanced `for-each` loop** iterates through the array of raw lottery ticket strings.
2.  **String Cleaning:** For each ticket, the dashes (`-`) are removed using `String.replace()`.
3.  **Data Conversion:** The resulting digit string is converted into an array of individual digits (`char[]` then to `int`).
4.  **Calculation:** A **standard `for` loop** calculates the **sum** and **average** of all ten digits in the ticket.
5.  **Winner Determination:** The average is compared against a running high-score, updating the `highestAverage` and the `winningNumberTicket` variables as needed.
6.  **Output:** Prints a detailed analysis for every ticket and announces the final winner.

---

## 💻 Example Usage
The program is hardcoded to analyze the following input data:

```java
String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};

**Analyzing: 12-34-56-78-90
**Digit Sum: 45, Digit Average: 4.5
**Analyzing: 33-44-11-66-22
**Digit Sum: 30, Digit Average: 3.0
**Analyzing: 01-02-03-04-05
**Digit Sum: 15, Digit Average: 1.5

-----------------------------------------------------
The winning number with the highest average is: 12-34-56-78-90 with an average of 4.5
-----------------------------------------------------

