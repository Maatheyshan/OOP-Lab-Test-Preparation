package edu.practice.dispatch.model;
public class NewAirMission {

    private long id;
    private int distanceKm;
    private int loadKg;
    private int windPenalty;
    private boolean critical;

    public NewAirMission() {}
    public NewAirMission(long id, int distanceKm, int loadKg, int windPenalty, boolean critical) {
        this.id = id;
        this.distanceKm = distanceKm;
        this.loadKg = loadKg;
        this.windPenalty = windPenalty;
        this.critical = critical;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }

    public int getLoadKg() {
        return loadKg;
    }

    public void setLoadKg(int loadKg) {
        this.loadKg = loadKg;
    }

    public int getWindPenalty() {
        return windPenalty;
    }

    public void setWindPenalty(int windPenalty) {
        this.windPenalty = windPenalty;
    }

    public boolean getCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }
}