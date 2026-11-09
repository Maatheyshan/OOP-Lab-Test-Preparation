package edu.practice.dispatch.exception;
public class MissionNotFoundException extends RuntimeException {
 public MissionNotFoundException(long id){
  super("Mission not found: "+id);
 }
}
