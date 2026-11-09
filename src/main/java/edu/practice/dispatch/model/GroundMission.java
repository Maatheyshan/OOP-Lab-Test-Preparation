package edu.practice.dispatch.model;

public class GroundMission extends DispatchMission {
 private final boolean medical;

 public GroundMission(long id, int distanceKm, int loadKg, boolean medical) {
  super(id, distanceKm, loadKg);
  this.medical = medical;

 }

 public boolean isMedical() {
  return medical;
 }


 @Override
 public int energyUnits() {


  // TODO Task 1: energy = 2*distanceKm + 5*loadKg; avoid integer overflow.
  long energy = 2L * getDistanceKm() + 5L * getLoadKg();
  return Math.toIntExact(energy);

 }

 @Override
 public int priority() {
  // TODO Task 1: medical=3, otherwise=1.
  return medical ? 3 : 1; //usage of ternary operator
 }

}
