package edu.practice.dispatch.model;
public class PlanLine {

    private long id;
    private String type;
    private int priority;
    private int energyUnits;

    public PlanLine() {}
    public PlanLine(long id, String type, int priority, int energyUnits) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        this.energyUnits = energyUnits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getEnergyUnits() {
        return energyUnits;
    }

    public void setEnergyUnits(int energyUnits) {
        this.energyUnits = energyUnits;
    }
}