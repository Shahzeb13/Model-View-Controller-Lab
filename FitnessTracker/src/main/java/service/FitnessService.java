/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author MULTI LAPTOP
 */

import java.util.List;
import data.FitnessRepository;
import Model.FitnessEntry;

public class FitnessService {
    private FitnessRepository repository;

    public FitnessService(FitnessRepository repository) {
        this.repository = repository;
    }

    public void addFitnessEntry(String date, int workoutMinutes, int caloriesConsumed, int caloriesBurned) {
        FitnessEntry entry = new FitnessEntry(date, workoutMinutes, caloriesConsumed, caloriesBurned);
        repository.saveEntry(entry);
    }

    public List<FitnessEntry> getAllEntries() {
        return repository.getAllEntries();
    }

    public int calculateNetCalories() {
        int totalCaloriesConsumed = repository.getTotalCaloriesConsumed();
        int totalCaloriesBurned = repository.getTotalCaloriesBurned();
        return totalCaloriesConsumed - totalCaloriesBurned;
    }
}

