/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author MULTI LAPTOP
 */


public class FitnessEntry {
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

