Project Title: ATM Banking System (Java Console Application)

Description: This project is a simple ATM simulation program written in
Java. It allows users to log in using an ATM number and PIN, then
perform basic banking operations such as checking balance, depositing
money, withdrawing money, and viewing a mini statement.

Features: - Secure login with ATM number and PIN - Balance inquiry -
Deposit functionality - Withdrawal functionality (multiples of
100/200/500) - Transaction history (Mini Statement) - Menu‑driven
console interface

Project Structure: ATM_Project/ ├── src/ │ └── atmpackages/ │ ├──
ATMStructure.java → Main class (Program execution starts here) │ ├──
ATMOperations.java → Interface containing ATM operations logic │ └──
ATM_variables.java → Class storing account data └── bin/ (compiled
files)

Technologies Used: - Java - OOP Concepts (Encapsulation, Interface,
Classes) - Collections Framework (HashMap) - Scanner class for input

How to Run: 
1. Open project in any Java IDE (Eclipse recommended).

2. Compile the project.
  
3. Run ATMStructure.java

4.Enter credentials: ATM
Number: 1234 PIN: 1030 

5. Choose desired option from menu.

Sample Menu:

1. Check Balance 
2. Deposit Amount
3. Withdraw Amount
4.Mini Statement
5. Exit

Notes: - Withdrawal only works for denominations of 100, 200, or 500. -
Default balance is 0 unless modified in code. - This project is for
learning purposes only and does not connect to real banking systems.

Author:Bolagani Kumar Raja.

License: Free to use for educational purposes.
