import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        double weight, height;
        double bmi = 0;
        String bmiSystem;
        String bmiCategory;

        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        bmiSystem = userInput.obtainBMISystem();

        switch (bmiSystem.toUpperCase()) {
            case "IMPERIAL":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiImperial(weight, height);
                break;
            case "METRIC":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiMetric(weight, height);
                break;
            case "":
                System.out.println("Please Enter a valid BMI System as input");
                break;
        }

        System.out.println("Your BMI is: " + bmi);

        bmiCategory = bmiCalculator.getBMICategory(bmi);

        System.out.println("Your BMI category is: " + bmiCategory);
    }
}

class BMICalculator {
    private double weightInPounds;
    private double heightInInches;
    private double weightInKilos;
    private double heightInMeters;

    public BMICalculator() {
        this.weightInPounds = 0;
        this.heightInInches = 0;
        this.weightInKilos = 0;
        this.heightInMeters = 0;
    }

    public double calculateBmiImperial(double weight, double height) {
        this.weightInPounds = weight;
        this.heightInInches = height;
        return (weightInPounds / (heightInInches * heightInInches)) * 703;
    }

    public double calculateBmiMetric(double weight, double height) {
        this.weightInKilos = weight;
        this.heightInMeters = height;
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

class UserInput {
    public String obtainBMISystem() {
        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric):");

        Scanner input = new Scanner(System.in);
        String bmiSystem = input.next();

        if (!(bmiSystem.equalsIgnoreCase("Imperial") || bmiSystem.equalsIgnoreCase("Metric"))) {
            return "";
        }

        return bmiSystem;
    }

    public double obtainWeight(String bmiSystem) {
        double weight = 0;
        boolean isInvalidInput = true;

        while (isInvalidInput) {
            Scanner input = new Scanner(System.in);
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    System.out.print("Enter weight in Pounds:");
                    break;
                case "METRIC":
                    System.out.print("Enter weight in Kilos:");
                    break;
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid weight");
            }
        }

        return weight;
    }

    public double obtainHeight(String bmiSystem) {
        double height = 0;
        boolean isInvalidInput = true;

        while (isInvalidInput) {
            Scanner input = new Scanner(System.in);
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL":
                    System.out.print("Enter height in Inches:");
                    break;
                case "METRIC":
                    System.out.print("Enter height in Meters:");
                    break;
            }

            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid height");
            }
        }

        return height;
    }
}
