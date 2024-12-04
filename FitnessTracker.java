import java.util.ArrayList;
import java.util.Scanner;

class FitnessEntry {
    private String date;
    private int workoutMinutes;
    private int caloriesConsumed;
    private int caloriesBurned;

    public FitnessEntry(String date, int workoutMinutes, int caloriesConsumed, int caloriesBurned) {
        this.date = date;
        this.workoutMinutes = workoutMinutes;
        this.caloriesConsumed = caloriesConsumed;
        this.caloriesBurned = caloriesBurned;
    }

    public String getDate() {
        return date;
    }

    public int getWorkoutMinutes() {
        return workoutMinutes;
    }

    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public String toString() {
        return String.format("Date: %s | Workout: %d mins | Calories Consumed: %d | Calories Burned: %d",
                date, workoutMinutes, caloriesConsumed, caloriesBurned);
    }
}

public class FitnessTracker {
    private ArrayList<FitnessEntry> entries = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEntry() {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter workout duration (minutes): ");
        int workoutMinutes = scanner.nextInt();

        System.out.print("Enter calories consumed: ");
        int caloriesConsumed = scanner.nextInt();

        System.out.print("Enter calories burned: ");
        int caloriesBurned = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        entries.add(new FitnessEntry(date, workoutMinutes, caloriesConsumed, caloriesBurned));
        System.out.println("Entry added successfully!\n");
    }

    public void viewEntries() {
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

    public void calculateNetCalories() {
        int totalCaloriesConsumed = 0;
        int totalCaloriesBurned = 0;

        for (FitnessEntry entry : entries) {
            totalCaloriesConsumed += entry.getCaloriesConsumed();
            totalCaloriesBurned += entry.getCaloriesBurned();
        }

        System.out.println("Total Calories Consumed: " + totalCaloriesConsumed);
        System.out.println("Total Calories Burned: " + totalCaloriesBurned);
        System.out.println("Net Calories: " + (totalCaloriesConsumed - totalCaloriesBurned) + "\n");
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

    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        tracker.menu();
    }
}
