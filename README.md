# Banking System POC - Week 1

A refactored, professional Java Banking System demonstrating core OOP concepts, package management, and GUI development using Swing.

## 🚀 Key Features
- **Refactored Architecture**: Clean package structure (`com.bank.*`) following industry standards.
- **Account Management**: Support for Savings, Current, and Student accounts with unique business rules.
- **Data Persistence**: Uses Java Serialization to save and load data from disk.
- **Robustness**: Custom exception handling for banking operations (Insufficient funds, Account not found).

## 🛠️ Concepts Demonstrated
- **OOP**: Inheritance, Encapsulation, Polymorphism.
- **Design Patterns**: Singleton (GUI Management), Strategy (Account Types).
- **Java Core**: Collections, File I/O, Custom Exceptions.

## 📦 How to Run

### 1. Compile the Project
Open your terminal in the root directory and run:
```bash
mkdir -p out && find src -name "*.java" > sources.txt && javac -d out @sources.txt && rm sources.txt
```

### 2. Launch the Application
```bash
java -cp out com.bank.main.Application
```

### 🔑 Login Credentials
- **Username:** `admin`
- **Password:** `admin`

---
*Developed as part of Java Foundations Week 1 Roadmap.*
