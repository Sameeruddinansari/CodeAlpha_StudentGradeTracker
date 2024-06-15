package CodeAlpha_Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input Grade From User
        System.out.println("Welcome to the Student Grade Tracker");

        while (true) {
            System.out.print("Enter a student's grade (or type 'done' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                grades.add(grade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid grade or 'done' to finish.");
            }
        }

        // Compute and display average ,highest,and lowest grades
        if (!grades.isEmpty()) {
            double Average = computeAverage(grades);
            double Highest = findHighest(grades);
            double Lowest = findLowest(grades);

            // Display results
            System.out.println("\nNumber of grades entered: " + grades.size());
            System.out.printf("Average grade: %.2f%n", Average);
            System.out.printf("Highest grade: %.2f%n", Highest);
            System.out.printf("Lowest grade: %.2f%n", Lowest);
        } else {
            System.out.println("No grades entered.");
        }

        scanner.close();
    }

    // Method to find the average of the grades
    public static double computeAverage(ArrayList<Double> grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
