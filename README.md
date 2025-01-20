# BMI Calculator Application

This is a Java-based BMI (Body Mass Index) calculator application that allows users to calculate their BMI using either the Imperial or Metric system. The program calculates BMI based on the user's weight and height input, and provides an interpretation of their BMI category.

## Features

- **Supports Two BMI Calculation Systems**:
  - Imperial (Pounds and Inches)
  - Metric (Kilograms and Meters)
  
- **BMI Categories**:
  - Underweight
  - Normal weight
  - Overweight
  - Obesity

## How to Use

Step 1. **Clone the repository**:
   You can clone the repository to your local machine using the following command:
   ```bash
   git clone https://github.com/idevhabib5/BMI-Calculator.git

Step 2: Navigate to the project directory
After cloning the repository, navigate to the project directory:

bash
Copy
cd your-repository-name
Step 3: Compile the Java code
If you are using the command line, compile the Java files:

bash
Copy
javac CalculateBMI.java
Step 4: Run the application
Once the code is compiled, run the program:

bash
Copy
java CalculateBMI
Step 5: Input Instructions
Upon running the application, you will be prompted to choose between the Imperial or Metric system for calculating your BMI:
Imperial: If you choose the Imperial system, you'll input your weight in pounds and height in inches.
Metric: If you choose the Metric system, you'll input your weight in kilograms and height in meters.
Step 6: Enter your details
After selecting your system, the program will prompt you to enter:

Your weight based on the system.
Your height based on the system.
Step 7: View the result
The program will calculate your BMI and categorize it into one of the following categories:

Underweight: BMI less than 18.5
Normal weight: BMI between 18.5 and 24.9
Overweight: BMI between 25 and 29.9
Obesity: BMI of 30 or higher
Example Interaction:
text
Copy
Welcome to the BMI calculator app!
Please select the preferred BMI calculation system (Imperial/Metric): Imperial
Enter weight in Pounds: 150
Enter height in Inches: 65
Your BMI is: 24.96
Your BMI category is: Normal weight
Code Structure
CalculateBMI Class
This is the main class that handles the user interaction and controls the flow of the program. It initializes instances of UserInput and BMICalculator to get the user's input and calculate the BMI based on the chosen system.

BMICalculator Class
This class is responsible for calculating BMI:

calculateBmiImperial: Calculates BMI using the Imperial system.
calculateBmiMetric: Calculates BMI using the Metric system.
getBMICategory: Returns the BMI category based on the calculated BMI.
UserInput Class
This class handles the user input:

obtainBMISystem: Prompts the user to choose between the Imperial or Metric BMI system.
obtainWeight: Asks the user to input their weight based on the chosen system.
obtainHeight: Asks the user to input their height based on the chosen system.
Requirements
Java 8 or higher
