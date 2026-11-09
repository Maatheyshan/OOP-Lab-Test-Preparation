package edu.practice.dispatch.model;
public abstract class DispatchMission {

 private final long id;
 private final int distanceKm;
 private final int loadKg;

 protected DispatchMission(long id,int distanceKm,int loadKg){
  this.id=id;
  this.distanceKm=distanceKm;
  this.loadKg=loadKg;
 }

 public long getId(){
  return id;
 }

 public int getDistanceKm(){
  return distanceKm;
 }

 public int getLoadKg(){
  return loadKg;
 }

 public abstract int energyUnits();
 public abstract int priority();
}
