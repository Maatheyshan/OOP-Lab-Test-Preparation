package edu.practice.dispatch.repository;
import edu.practice.dispatch.model.*;
import java.util.*;
import java.util.concurrent.*;
import org.springframework.stereotype.Repository;

@Repository public class MissionRepository {
 private final Map<Long,DispatchMission> map=new ConcurrentHashMap<>();

 public MissionRepository(){
  map.put(101L,new GroundMission(101,12,3,true));
  map.put(102L,new GroundMission(102,4,2,false));
  map.put(103L,new NewAirMission(103,8,1,3,true));
  // TODO after Task 2: seed AirMission(103,8,1,3,true).
 }
 public Collection<DispatchMission> all(){
  return List.copyOf(map.values());
 }

 public DispatchMission find(long id){
  return map.get(id);
 }

 public boolean exists(long id){
  return map.containsKey(id);
 }



 public void save(DispatchMission m){
  map.put(m.getId(),m);
 }
}
