package edu.practice.dispatch.service;
import edu.practice.dispatch.model.*;
import edu.practice.dispatch.repository.*;
import edu.practice.dispatch.exception.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service public class DispatchService {
 private final MissionRepository repo;

 public DispatchService(MissionRepository repo){
  this.repo=repo;
 }

 public Collection<DispatchMission> all(){
  return repo.all();
 }

 public int energy(long id){
  // TODO Task 3: retrieve and calculate energy; raise MissionNotFoundException if absent.
  throw new UnsupportedOperationException("Task 3");
 }

 public DispatchMission addAir(NewAirMission request){
  // TODO Task 3: validate numerical values and unique ID; calculate once to reject overflow.
  throw new UnsupportedOperationException("Task 3");
 }

 public DispatchPlan plan(int capacity,boolean urgentOnly){
  // TODO Task 2: filter optional urgent missions (priority >=3), sort priority DESC,
  // energy ASC, ID ASC; select greedily if energy fits; preserve skipped IDs.
  throw new UnsupportedOperationException("Task 2");
 }

}
