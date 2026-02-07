# KNUST Java Assignment Repository

Welcome to my KNUST Java Assignment repository! This is a comprehensive collection and tracking system for all my Java programming assignments throughout the KNUST Programming course. This repository serves as a centralized location for assignment code, progress tracking, and documentation.

## 📋 Table of Contents

- [Repository Overview](#repository-overview)
- [Current Assignments](#current-assignments)
- [Repository Structure](#repository-structure)
- [Prerequisites](#prerequisites)
- [Setting Up Your Environment](#setting-up-your-environment)
- [Running Programs - Complete Guide](#running-programs---complete-guide)
  - [Method 1: Command Line (Windows)](#method-1-command-line-windows)
  - [Method 2: Command Line (macOS/Linux)](#method-2-command-line-macoslinux)
  - [Method 3: Eclipse IDE](#method-3-eclipse-ide)
  - [Method 4: IntelliJ IDEA](#method-4-intellij-idea)
  - [Method 5: Visual Studio Code](#method-5-visual-studio-code)
  - [Method 6: NetBeans IDE](#method-6-netbeans-ide)
  - [Method 7: Online Compilers](#method-7-online-compilers)
- [Program Descriptions](#program-descriptions)
- [Assignment Progress Tracker](#assignment-progress-tracker)
- [Troubleshooting](#troubleshooting)
- [Contributing to This Repo](#contributing-to-this-repo)
- [Author](#author)

## 🎯 Repository Overview

This repository serves as a **complete tracking and version control system** for all my Java programming assignments at KNUST. Each assignment is maintained as an independent, well-documented program with proper versioning and commit history.

### Purpose
- 📝 **Track Progress:** Monitor completion status of all assignments
- 🗂️ **Organize Code:** Keep all Java programs in one centralized location
- 📚 **Document Solutions:** Maintain clear documentation for each implementation
- 🔄 **Version Control:** Track changes and improvements over time
- 💾 **Backup:** Secure cloud-based backup of all assignment work
- 📊 **Portfolio:** Showcase programming skills and learning journey

**Repository Link:** [https://github.com/glitchwraith20/knust-java-assignment.git](https://github.com/glitchwraith20/knust-java-assignment.git)

## 📊 Current Assignments

### Assignment Set 1 - Fundamentals (February 2026)

| # | Program Name | Status | Type | Submission |
|---|--------------|--------|------|------------|
| 1 | ElectricityBillCalculator | ✅ Complete | Submission | Required |
| 2 | WarehouseAnalysis | ✅ Complete | Logbook | Algorithm + Code |
| 3 | FuelConsumptionAnalysis | ✅ Complete | Submission | Required |
| 4 | MobileDataMonitor | ✅ Complete | Logbook | Algorithm + Code |
| 5 | CinemaTicketBooking | ✅ Complete | Submission | Required |
| 6 | KioskSystem | ✅ Complete | Logbook | Algorithm + Code |

### Future Assignments
*This section will be updated as new assignments are released*

- Assignment Set 2 - *Coming Soon*
- Assignment Set 3 - *Coming Soon*
- Midterm Projects - *Coming Soon*
- Final Project - *Coming Soon*

## 📁 Repository Structure

### Current Organization

```
knust-java-assignment/
│
├── README.md                          # This documentation file
│
├── Assignment Set 1 (Fundamentals)/
│   ├── ElectricityBillCalculator.java    # Electricity bill calculator
│   ├── ElectricityBillCalculator.class   # Compiled bytecode
│   │
│   ├── WarehouseAnalysis.java            # Warehouse weight analysis
│   ├── WarehouseAnalysis.class           # Compiled bytecode
│   │
│   ├── FuelConsumptionAnalysis.java      # Weekly fuel tracking
│   ├── FuelConsumptionAnalysis.class     # Compiled bytecode
│   │
│   ├── MobileDataMonitor.java            # Mobile data monitoring
│   ├── MobileDataMonitor.class           # Compiled bytecode
│   │
│   ├── CinemaTicketBooking.java          # Cinema ticket booking
│   ├── CinemaTicketBooking.class         # Compiled bytecode
│   │
│   ├── KioskSystem.java                  # Fast-food kiosk system
│   ├── KioskSystem.class                 # Compiled bytecode
│   │
│   ├── Assignment1.java                  # Additional files
│   └── assignment2.java                  # Additional files
│
├── Assignment Set 2/                  # Future assignments
│   └── (To be added)
│
├── Assignment Set 3/                  # Future assignments
│   └── (To be added)
│
├── Projects/                          # Course projects
│   └── (To be added)
│
└── Resources/                         # Additional resources
    ├── Algorithms/                    # Algorithm documents
    ├── Notes/                         # Course notes
    └── References/                    # Reference materials
```

### File Naming Convention

- **Source Files:** `ProgramName.java` (matches class name exactly)
- **Compiled Files:** `ProgramName.class` (auto-generated after compilation)
- **Assignment Files:** `AssignmentX.java` where X is the assignment number

### Organization Strategy

**Current Structure:**
- All current assignment files are in the root directory for easy access
- Each `.java` file has a corresponding `.class` file after compilation

**Future Organization Plans:**
As the repository grows, files will be organized into folders by:
- Assignment sets (Assignment 1, Assignment 2, etc.)
- Topic areas (Loops, Arrays, OOP, etc.)
- Project types (Individual, Group, Final)

**File Types:**
- `.java` = Source code (human-readable, editable)
- `.class` = Compiled bytecode (machine-readable, executable)
- `.md` = Markdown documentation files

## ✅ Prerequisites

Before running any programs, ensure you have:

1. **Java Development Kit (JDK)** - Version 8 or higher
2. **Text Editor or IDE** (choose one):
   - Command Line Terminal (built-in)
   - Eclipse IDE
   - IntelliJ IDEA
   - Visual Studio Code
   - NetBeans
   - Or any other Java-compatible IDE

### Checking Java Installation

Open your terminal/command prompt and run:

```bash
java -version
javac -version
```

If installed correctly, you should see version information. If not, download JDK from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or use OpenJDK.

## 🔧 Setting Up Your Environment

### Cloning the Repository

**Option 1: Using Git**
```bash
git clone https://github.com/glitchwraith20/knust-java-assignment.git
cd knust-java-assignment
```

**Option 2: Download ZIP**
1. Go to [https://github.com/glitchwraith20/knust-java-assignment](https://github.com/glitchwraith20/knust-java-assignment)
2. Click the green "Code" button
3. Select "Download ZIP"
4. Extract the ZIP file to your desired location
5. Navigate to the extracted folder

## 💻 Running Programs - Complete Guide

### Method 1: Command Line (Windows)

#### Step-by-Step Instructions:

1. **Open Command Prompt:**
   - Press `Win + R`
   - Type `cmd` and press Enter

2. **Navigate to the repository folder:**
   ```cmd
   cd C:\path\to\knust-java-assignment
   ```
   Example:
   ```cmd
   cd C:\Users\YourName\Documents\knust-java-assignment
   ```

3. **Compile a Java file:**
   ```cmd
   javac ElectricityBillCalculator.java
   ```
   This creates `ElectricityBillCalculator.class`

4. **Run the compiled program:**
   ```cmd
   java ElectricityBillCalculator
   ```

5. **Compile and run in one command:**
   ```cmd
   javac ElectricityBillCalculator.java && java ElectricityBillCalculator
   ```

#### Running Each Program (Windows):

```cmd
:: Question 1
javac ElectricityBillCalculator.java && java ElectricityBillCalculator

:: Question 2
javac WarehouseAnalysis.java && java WarehouseAnalysis

:: Question 3
javac FuelConsumptionAnalysis.java && java FuelConsumptionAnalysis

:: Question 4
javac MobileDataMonitor.java && java MobileDataMonitor

:: Question 5
javac CinemaTicketBooking.java && java CinemaTicketBooking

:: Question 6
javac KioskSystem.java && java KioskSystem
```

### Method 2: Command Line (macOS/Linux)

#### Step-by-Step Instructions:

1. **Open Terminal:**
   - macOS: Press `Cmd + Space`, type "Terminal", press Enter
   - Linux: Press `Ctrl + Alt + T`

2. **Navigate to the repository folder:**
   ```bash
   cd ~/path/to/knust-java-assignment
   ```
   Example:
   ```bash
   cd ~/Documents/knust-java-assignment
   ```

3. **Compile a Java file:**
   ```bash
   javac ElectricityBillCalculator.java
   ```

4. **Run the compiled program:**
   ```bash
   java ElectricityBillCalculator
   ```

5. **Compile and run in one command:**
   ```bash
   javac ElectricityBillCalculator.java && java ElectricityBillCalculator
   ```

#### Running Each Program (macOS/Linux):

```bash
# Question 1
javac ElectricityBillCalculator.java && java ElectricityBillCalculator

# Question 2
javac WarehouseAnalysis.java && java WarehouseAnalysis

# Question 3
javac FuelConsumptionAnalysis.java && java FuelConsumptionAnalysis

# Question 4
javac MobileDataMonitor.java && java MobileDataMonitor

# Question 5
javac CinemaTicketBooking.java && java CinemaTicketBooking

# Question 6
javac KioskSystem.java && java KioskSystem
```

### Method 3: Eclipse IDE

#### Initial Setup:

1. **Download and Install Eclipse:**
   - Visit [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
   - Download "Eclipse IDE for Java Developers"
   - Install and launch Eclipse

2. **Create/Import Project:**

   **Option A: Import Existing Files**
   - Click `File` → `New` → `Java Project`
   - Uncheck "Use default location"
   - Click `Browse` and select your `knust-java-assignment` folder
   - Click `Finish`

   **Option B: Create New Project and Copy Files**
   - Click `File` → `New` → `Java Project`
   - Enter project name: `KNUST-Java-Assignment`
   - Click `Finish`
   - Right-click on `src` folder → `Import` → `File System`
   - Browse to your `knust-java-assignment` folder
   - Select all `.java` files
   - Click `Finish`

#### Running Programs in Eclipse:

1. **Open a Java file:**
   - In Package Explorer, expand your project
   - Double-click on any `.java` file (e.g., `ElectricityBillCalculator.java`)

2. **Run the program:**
   - **Method A:** Click the green "Run" button (▶️) in the toolbar
   - **Method B:** Right-click on the file → `Run As` → `Java Application`
   - **Method C:** Press `Ctrl + F11` (Windows/Linux) or `Cmd + F11` (macOS)

3. **View output:**
   - Check the "Console" tab at the bottom of Eclipse
   - Enter input when prompted

#### Running Each Program:

1. Click on `ElectricityBillCalculator.java` → Run
2. Click on `WarehouseAnalysis.java` → Run
3. Click on `FuelConsumptionAnalysis.java` → Run
4. Click on `MobileDataMonitor.java` → Run
5. Click on `CinemaTicketBooking.java` → Run
6. Click on `KioskSystem.java` → Run

### Method 4: IntelliJ IDEA

#### Initial Setup:

1. **Download and Install IntelliJ IDEA:**
   - Visit [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
   - Download Community Edition (free) or Ultimate Edition
   - Install and launch IntelliJ IDEA

2. **Open/Import Project:**

   **Option A: Open Folder**
   - Click `File` → `Open`
   - Navigate to `knust-java-assignment` folder
   - Click `OK`
   - If prompted, select "Trust Project"

   **Option B: Import from Git**
   - Click `Get from VCS` on welcome screen
   - Enter URL: `https://github.com/glitchwraith20/knust-java-assignment.git`
   - Choose directory and click `Clone`

3. **Configure Project SDK:**
   - Click `File` → `Project Structure` → `Project`
   - Set "Project SDK" to your installed JDK
   - Click `OK`

#### Running Programs in IntelliJ IDEA:

1. **Open a Java file:**
   - In Project panel (left side), expand folders
   - Double-click on any `.java` file

2. **Run the program:**
   - **Method A:** Click green arrow (▶️) next to the class name
   - **Method B:** Right-click on the file → `Run 'ClassName.main()'`
   - **Method C:** Press `Shift + F10` (Windows/Linux) or `Ctrl + R` (macOS)

3. **View output:**
   - Check the "Run" panel at the bottom
   - Enter input when prompted

#### Running Each Program:

1. Open `ElectricityBillCalculator.java` → Click green arrow → Run
2. Open `WarehouseAnalysis.java` → Click green arrow → Run
3. Open `FuelConsumptionAnalysis.java` → Click green arrow → Run
4. Open `MobileDataMonitor.java` → Click green arrow → Run
5. Open `CinemaTicketBooking.java` → Click green arrow → Run
6. Open `KioskSystem.java` → Click green arrow → Run

### Method 5: Visual Studio Code

#### Initial Setup:

1. **Download and Install VS Code:**
   - Visit [https://code.visualstudio.com/](https://code.visualstudio.com/)
   - Download and install for your operating system

2. **Install Java Extensions:**
   - Open VS Code
   - Click Extensions icon (or press `Ctrl + Shift + X`)
   - Search for "Extension Pack for Java"
   - Click `Install` on the Microsoft extension pack

3. **Open Repository:**
   - Click `File` → `Open Folder`
   - Navigate to `knust-java-assignment` folder
   - Click `Select Folder`

#### Running Programs in VS Code:

1. **Open a Java file:**
   - In Explorer panel (left side), click on any `.java` file

2. **Run the program:**
   - **Method A:** Click `Run` button above the main method
   - **Method B:** Right-click in editor → `Run Java`
   - **Method C:** Press `F5` to run with debugging
   - **Method D:** Use Command Palette (`Ctrl + Shift + P`) → Type "Java: Run"

3. **View output:**
   - Check the integrated Terminal at the bottom
   - Enter input when prompted

#### Running Each Program:

1. Open `ElectricityBillCalculator.java` → Click "Run" above main()
2. Open `WarehouseAnalysis.java` → Click "Run" above main()
3. Open `FuelConsumptionAnalysis.java` → Click "Run" above main()
4. Open `MobileDataMonitor.java` → Click "Run" above main()
5. Open `CinemaTicketBooking.java` → Click "Run" above main()
6. Open `KioskSystem.java` → Click "Run" above main()

### Method 6: NetBeans IDE

#### Initial Setup:

1. **Download and Install NetBeans:**
   - Visit [https://netbeans.apache.org/download/](https://netbeans.apache.org/download/)
   - Download NetBeans with JDK
   - Install and launch NetBeans

2. **Create/Import Project:**
   - Click `File` → `New Project`
   - Select `Java` → `Java Project with Existing Sources`
   - Click `Next`
   - Enter project name: `KNUST-Java-Assignment`
   - Click `Next`
   - Click `Add Folder` and select your `knust-java-assignment` folder
   - Click `Finish`

#### Running Programs in NetBeans:

1. **Open a Java file:**
   - In Projects panel, expand `Source Packages`
   - Double-click on any `.java` file

2. **Run the program:**
   - **Method A:** Click green "Run Project" button (▶️) in toolbar
   - **Method B:** Right-click on file → `Run File`
   - **Method C:** Press `Shift + F6`

3. **View output:**
   - Check the "Output" panel at the bottom
   - Enter input when prompted

### Method 7: Online Compilers

If you don't want to install anything locally, use online Java compilers:

#### Popular Online Compilers:

1. **JDoodle** - [https://www.jdoodle.com/online-java-compiler](https://www.jdoodle.com/online-java-compiler)
2. **OnlineGDB** - [https://www.onlinegdb.com/online_java_compiler](https://www.onlinegdb.com/online_java_compiler)
3. **Replit** - [https://replit.com/languages/java](https://replit.com/languages/java)
4. **Programiz** - [https://www.programiz.com/java-programming/online-compiler/](https://www.programiz.com/java-programming/online-compiler/)

#### Steps:

1. Go to any online compiler website
2. Copy the content of a `.java` file from the repository
3. Paste it into the online editor
4. Click "Run" or "Execute"
5. Provide input when prompted in the console area

## 📚 Program Descriptions

### 1. ElectricityBillCalculator.java
**Purpose:** Calculates electricity bills for multiple appliances with surcharge logic.

**What it does:**
- Asks for number of appliances
- Collects consumption (kWh) for each appliance
- Applies 15% surcharge for consumption > 100 kWh
- Displays individual and total costs

**Sample Run:**
```
Enter total number of appliances: 2
Enter consumption (kWh) for appliance 1: 120
Appliance 1: 120.0 kWh, Cost: $27.60 (Surcharge Applied)
Enter consumption (kWh) for appliance 2: 80
Appliance 2: 80.0 kWh, Cost: $16.00
Total Consumption: 200.0 kWh
Total Cost: $43.60
```

---

### 2. WarehouseAnalysis.java
**Purpose:** Analyzes weight distribution of warehouse boxes.

**What it does:**
- Uses pre-defined array of 10 box weights
- Classifies boxes as Heavy (>50kg), Medium (20-50kg), or Light (<20kg)
- Calculates total weight, average, and identifies heaviest box
- Provides statistical summary

**Sample Output:**
```
Box Classification:
Box 1: Light
Box 2: Heavy
Box 3: Medium
...
=== Summary ===
Total Weight: 318.0 kg
Average Weight: 31.8 kg
Heavy Boxes: 2
Medium Boxes: 5
Light Boxes: 3
Heaviest Box: Box 6 with 60.0 kg
```

---

### 3. FuelConsumptionAnalysis.java
**Purpose:** Tracks weekly fuel consumption with while loop implementation.

**What it does:**
- Analyzes 7 days of fuel data using while loop
- Classifies daily usage as High (>20L), Normal (10-20L), or Low (<10L)
- Calculates weekly totals and averages
- Identifies peak consumption day

**Sample Output:**
```
Daily Fuel Consumption Report:
Day 1: 12.50 liters - Normal
Day 2: 22.00 liters - High
Day 3: 8.40 liters - Low
...
=== Weekly Summary ===
Total Fuel Consumption: 111.60 liters
Average Daily Consumption: 15.94 liters
Peak Consumption: Day 5 with 25.30 liters
```

---

### 4. MobileDataMonitor.java
**Purpose:** Simulates real-time mobile data consumption monitoring.

**What it does:**
- Starts with 20 GB balance
- Accepts session-by-session data usage
- Validates input (rejects negative values)
- Shows status alerts based on remaining balance
- Continues until data is exhausted

**Sample Run:**
```
Enter data used in this session (GB): 5
Data balance is sufficient.
Current Balance: 15.00 GB

Enter data used in this session (GB): 12
Warning: Data balance is low.
Current Balance: 3.00 GB

Enter data used in this session (GB): 2.5
Critical: Data almost exhausted.
Current Balance: 0.50 GB
...
```

---

### 5. CinemaTicketBooking.java
**Purpose:** Interactive cinema ticket booking kiosk.

**What it does:**
- Displays menu with ticket options repeatedly
- Allows multiple ticket purchases
- Tracks total tickets and cost
- Classifies booking as Standard (1-3 tickets) or Group (>3 tickets)
- Shows final summary

**Sample Run:**
```
=== Cinema Ticket Booking ===
1. Regular Ticket - GH₵25.00
2. Student Ticket - GH₵15.00
3. VIP Ticket - GH₵50.00
4. Finish Booking
Select option: 1
Regular ticket added.
...
=== Booking Summary ===
Booking Type: Group booking
Total Tickets: 5
Total Cost: GH₵140.00
```

---

### 6. KioskSystem.java
**Purpose:** Fast-food ordering terminal with cart functionality.

**What it does:**
- Shows menu with Burger ($5.99) and Fries ($2.50)
- Prompts for quantity for each item selected
- Validates quantity (rejects negative values)
- Maintains running total
- Shows checkout summary

**Sample Run:**
```
=== Fast Food Kiosk ===
1. Burger - $5.99
2. Fries - $2.50
3. Checkout
Select option: 1
Enter quantity: 2
Added 2 Burgers to cart
...
=== Checkout Summary ===
Total Items: 4
Grand Total: $16.98
```

## 🔧 Troubleshooting

### Common Issues and Solutions

#### Issue 1: "javac is not recognized as an internal or external command"
**Problem:** Java is not installed or not in system PATH

**Solution:**
- **Windows:**
  1. Install JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/)
  2. Add Java to PATH:
     - Search "Environment Variables" in Windows
     - Edit "Path" variable
     - Add: `C:\Program Files\Java\jdk-XX\bin` (replace XX with your version)
     - Restart Command Prompt

- **macOS:**
  ```bash
  brew install openjdk
  ```

- **Linux (Ubuntu/Debian):**
  ```bash
  sudo apt update
  sudo apt install default-jdk
  ```

#### Issue 2: "Error: Could not find or load main class"
**Problem:** Running from wrong directory or incorrect class name

**Solution:**
- Ensure you're in the correct directory containing the `.class` file
- Use exact class name (case-sensitive): `java ElectricityBillCalculator` not `java electricitybillcalculator`
- Make sure you compiled first: `javac ElectricityBillCalculator.java`

#### Issue 3: "NoClassDefFoundError"
**Problem:** Class file is in different directory or package issue

**Solution:**
- Compile and run from the same directory
- Delete all `.class` files and recompile:
  ```bash
  # Windows
  del *.class
  
  # macOS/Linux
  rm *.class
  ```
- Then compile again: `javac YourProgram.java`

#### Issue 4: Compilation errors with special characters
**Problem:** Source files contain special characters (₵, GH₵)

**Solution:**
- Save files with UTF-8 encoding
- In VS Code: Click encoding in bottom bar → Save with Encoding → UTF-8
- In Eclipse: Right-click file → Properties → Text file encoding → UTF-8

#### Issue 5: Program doesn't accept input
**Problem:** Scanner issues or input stream problems

**Solution:**
- Make sure you're running the program, not just viewing it
- In IDEs, check the Console/Terminal panel is active
- Try running from command line instead

#### Issue 6: "Exception in thread "main" java.util.NoSuchElementException"
**Problem:** Scanner trying to read when no input is available

**Solution:**
- Ensure you're providing input when prompted
- Don't close IDE console while program is running
- If using online compiler, make sure to click in the input area

### IDE-Specific Issues

#### Eclipse: "Selection does not contain a main type"
**Solution:**
- Ensure your file has `public static void main(String[] args)`
- Right-click on project → Refresh
- Clean project: Project → Clean

#### IntelliJ IDEA: "Cannot start process"
**Solution:**
- File → Invalidate Caches → Invalidate and Restart
- Rebuild project: Build → Rebuild Project

#### VS Code: "Build failed"
**Solution:**
- Ensure Java Extension Pack is installed
- Check Java Home setting: View → Command Palette → "Java: Configure Java Runtime"
- Reload window: View → Command Palette → "Developer: Reload Window"

## 📝 Best Practices for Running Programs

1. **Always compile before running:**
   ```bash
   javac ProgramName.java
   java ProgramName
   ```

2. **Keep your repository organized:**
   - Don't mix source files with other projects
   - Keep `.java` and `.class` files in the same directory for simplicity

3. **Test each program individually:**
   - Run one program at a time to avoid confusion
   - Understand what each program does before running

4. **Use consistent naming:**
   - File names must match class names exactly (case-sensitive)
   - `ElectricityBillCalculator.java` contains `class ElectricityBillCalculator`

5. **Backup your work:**
   - Commit changes regularly if using Git
   - Keep copies of working versions

### Study Progress

**Concepts Mastered:**
- ✅ For loops
- ✅ While loops
- ✅ Do-while loops
- ✅ If-else statements
- ✅ Arrays
- ✅ Scanner input
- ✅ Printf formatting
- ✅ Input validation
- ✅ Constants and variables

**Concepts In Progress:**
- 🔄 Object-Oriented Programming (upcoming)
- 🔄 File I/O (upcoming)
- 🔄 Exception Handling (upcoming)

**Concepts To Learn:**
- ⏳ Advanced OOP concepts
- ⏳ Data structures
- ⏳ Algorithms
- ⏳ GUI programming

## 🎯 Quick Start Guide

**For complete beginners:**

1. **Install Java JDK** (one-time setup)
2. **Clone or download this repository**
3. **Choose your method:**
   - **Easiest:** Use an online compiler (no installation needed)
   - **Recommended:** Install VS Code with Java extensions
   - **Professional:** Use Eclipse or IntelliJ IDEA

4. **Run your first program:**
   ```bash
   javac ElectricityBillCalculator.java
   java ElectricityBillCalculator
   ```

5. **Follow the prompts and enjoy!**

## 🔄 Repository Maintenance

### Regular Updates

**After Each Assignment:**
1. ✅ Commit code with descriptive message
2. ✅ Update progress tracker
3. ✅ Test all programs
4. ✅ Update documentation if needed
5. ✅ Push to GitHub

**Git Commands for Tracking:**
```bash
# Add new or modified files
git add .

# Commit with meaningful message
git commit -m "Add Assignment 2 - Question 1: Array Manipulation"

# Push to GitHub
git push origin main

# Check status
git status

# View commit history
git log --oneline
```

### Branch Strategy (Optional)

```bash
# Create branch for new assignment
git checkout -b assignment-2

# Work on assignment...

# Merge back to main when complete
git checkout main
git merge assignment-2
```

## 📚 Learning Resources

### Official Documentation
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials](https://docs.oracle.com/javase/tutorial/)

### Recommended Practice
- [HackerRank Java](https://www.hackerrank.com/domains/java)
- [LeetCode](https://leetcode.com/)
- [Codecademy Java](https://www.codecademy.com/learn/learn-java)

### Course Materials
- KNUST Course Notes
- Lecture Slides
- Professor's Examples

## 👨‍💻 Author

**glitchwraith20**
- GitHub: [@glitchwraith20](https://github.com/glitchwraith20)
- Repository: [knust-java-assignment](https://github.com/glitchwraith20/knust-java-assignment)
- Course: KNUST Programming (3 Credit Hours)
- Academic Year: 2025/2026

## 📞 Support

If you encounter issues not covered in troubleshooting:

1. **Check Java installation:** `java -version` and `javac -version`
2. **Verify file location:** Ensure you're in the correct directory
3. **Read error messages carefully:** They usually indicate the problem
4. **Try a different method:** If command line doesn't work, try an IDE or online compiler

### Course Resources
- Course instructor office hours
- Course materials and documentation
- KNUST Programming course forums
- Study group collaboration

## 🎓 Course Information

**Course Details:**
- **Course:** Java Programming
- **Institution:** KNUST
- **Credit Hours:** 3
- **Importance:** Assignments carry significant weight

## 🤝 Contributing to This Repo

This is a personal academic repository, but contributions and suggestions are welcome:

### How to Suggest Improvements:
1. Fork the repository
2. Create a feature branch (`git checkout -b improve-documentation`)
3. Make your changes
4. Submit a pull request with detailed description

### Areas for Contribution:
- Bug fixes in existing code
- Documentation improvements
- Additional examples or test cases
- Performance optimizations
- Code refactoring suggestions

**Note:** All submissions must align with academic integrity policies. This repository is for learning and skill development.

## 📜 Academic Integrity Statement

This repository contains my original work for KNUST Programming course assignments. All code has been written by me unless otherwise cited. This repository serves as:
- A learning portfolio
- A version control system for my work
- A reference for future studies
- A demonstration of programming skills

**Collaboration:** While this is my personal work, I'm happy to discuss concepts and approaches with classmates. Direct copying of code violates academic integrity policies.

## 🔐 Repository Access

- **Public Access:** This repository is public for portfolio purposes
- **Viewing:** Anyone can view and clone the repository
- **Contributions:** Pull requests are reviewed before merging
- **Issues:** Bug reports and suggestions welcome via GitHub Issues

---

**Note:** This repository represents my learning journey in Java programming. Each commit reflects progress and improvement. The goal is not just to complete assignments, but to build a strong foundation in programming concepts.

**Repository Status:** 🟢 Active | **Last Updated:** February 2026

*This README will be updated as the course progresses and new assignments are added.*
