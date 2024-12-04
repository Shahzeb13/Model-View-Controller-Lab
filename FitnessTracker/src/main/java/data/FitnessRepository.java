/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author MULTI LAPTOP
 */

import java.util.ArrayList;
import java.util.List;
import Model.FitnessEntry;

public class FitnessRepository {
    private List<FitnessEntry> entries = new ArrayList<>();

    public void saveEntry(FitnessEntry entry) {
        entries.add(entry);
    }

    public List<FitnessEntry> getAllEntries() {
        return entries;
    }

    public int getTotalCaloriesConsumed() {
        return entries.stream().mapToInt(FitnessEntry::getCaloriesConsumed).sum();
    }

    public int getTotalCaloriesBurned() {
        return entries.stream().mapToInt(FitnessEntry::getCaloriesBurned).sum();
    }
}

