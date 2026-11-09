package edu.practice.dispatch.model;

import java.util.*;

public class DispatchPlan {
    private int capacity;
    private int energyUsed;
    private int energyRemaining;

    private List<PlanLine> selected;
    private List<Long> skipped;

    public DispatchPlan() {}
    public DispatchPlan(int capacity, int energyUsed, int energyRemaining, List<PlanLine> selected, List<Long> skipped) {
        this.capacity = capacity;
        this.energyUsed = energyUsed;
        this.energyRemaining = energyRemaining;
        this.selected = selected;
        this.skipped = skipped;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(int energyUsed) {
        this.energyUsed = energyUsed;
    }

    public int getEnergyRemaining() {
        return energyRemaining;
    }

    public void setEnergyRemaining(int energyRemaining) {
        this.energyRemaining = energyRemaining;
    }

    public List<PlanLine> getSelected() {
        return selected;
    }

    public void setSelected(List<PlanLine> selected) {
        this.selected = selected;
    }

    public List<Long> getSkipped() {
        return skipped;
    }

    public void setSkipped(List<Long> skipped) {
        this.skipped = skipped;
    }
}