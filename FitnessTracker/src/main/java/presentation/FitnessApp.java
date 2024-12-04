/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

/**
 *
 * @author MULTI LAPTOP
 */

import java.util.Scanner;
import service.FitnessService;
import data.FitnessRepository;
import Model.FitnessEntry;

public class FitnessApp {
    private FitnessService service;
    private Scanner scanner = new Scanner(System.in);

    public FitnessApp() {
        FitnessRepository repository = new FitnessRepository();
        service = new FitnessService(repository);
    }

    public void menu() {
        while (true) {
            System.out.println("===== Fitness Tracker Menu =====");
            System.out.println("1. Add a new entry");
            System.out.println("2. View all entries");
            System.out.println("3. Calculate net calories");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    viewEntries();
                    break;
                case 3:
                    calculateNetCalories();
                    break;
                case 4:
                    System.out.println("Exiting Fitness Tracker. Stay healthy!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    private void addEntry() {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter workout duration (minutes): ");
        int workoutMinutes = scanner.nextInt();

        System.out.print("Enter calories consumed: ");
        int caloriesConsumed = scanner.nextInt();

        System.out.print("Enter calories burned: ");
        int caloriesBurned = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        service.addFitnessEntry(date, workoutMinutes, caloriesConsumed, caloriesBurned);
        System.out.println("Entry added successfully!\n");
    }

    private void viewEntries() {
        var entries = service.getAllEntries();
        if (entries.isEmpty()) {
            System.out.println("No entries found!");
        } else {
            System.out.println("\nFitness Progress:");
            for (FitnessEntry entry : entries) {
                System.out.println(entry);
            }
        }
        System.out.println();
    }

    private void calculateNetCalories() {
        int netCalories = service.calculateNetCalories();
        System.out.println("Net Calories: " + netCalories + "\n");
    }

    public static void main(String[] args) {
        FitnessApp app = new FitnessApp();
        app.menu();
    }
}

