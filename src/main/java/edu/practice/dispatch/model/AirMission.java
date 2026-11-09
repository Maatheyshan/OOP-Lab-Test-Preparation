package edu.practice.dispatch.model;
import edu.practice.dispatch.model.DispatchMission;

public class AirMission extends DispatchMission {
    private final int windPenalty;
    private final boolean critical;

    public AirMission(long id, int distanceKm, int loadKg, int windPenalty, boolean critical) {
        super(id, distanceKm, loadKg);
        this.windPenalty = windPenalty;
        this.critical = critical;
    }

    public int getWindPenalty() {
        return windPenalty;
    }

    public boolean isCritical() {
        return critical;
    }

    @Override
    public int energyUnits() {
        long energy = 3L * getDistanceKm() + 8L * getLoadKg() + 2L * windPenalty;
        return Math.toIntExact(energy);
    }

    @Override
    public int priority() {
        return critical ? 5 : 2; // usage of ternary operator
    }



}