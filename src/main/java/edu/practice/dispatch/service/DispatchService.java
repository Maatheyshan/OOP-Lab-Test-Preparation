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


 public DispatchPlan plan(int capacity, boolean urgentOnly) {

  // Validate capacity.
  if (capacity <= 0) {
   throw new IllegalArgumentException(
           "Capacity must be greater than zero."
   );
  }

  // Copy all missions from the repository.
  List<DispatchMission> eligible = new ArrayList<>(repo.all());

  // Filter urgent missions (priority >= 3).
  if (urgentOnly) {
   eligible.removeIf(mission -> mission.priority() < 3);
  }

  // Sort by priority DESC, energy ASC, and ID ASC.
  eligible.sort(
          Comparator.comparingInt(DispatchMission::priority)
                  .reversed()
                  .thenComparingInt(DispatchMission::energyUnits)
                  .thenComparingLong(DispatchMission::getId)
  );

  List<PlanLine> selected = new ArrayList<>();
  List<Long> skipped = new ArrayList<>();

  int energyUsed = 0;

  // Traverse all eligible missions.
  for (DispatchMission mission : eligible) {

   int energy = mission.energyUnits();

   if (energy <= capacity - energyUsed) {

    selected.add(new PlanLine(
            mission.getId(),
            mission.getClass().getSimpleName(),
            mission.priority(),
            energy
    ));

    energyUsed += energy;

   } else {
    skipped.add(mission.getId());
   }
  }

  // Return the completed dispatch plan.
  return new DispatchPlan(
          capacity,
          energyUsed,
          capacity - energyUsed,
          selected,
          skipped
  );
 }

 private void validateRange(
         String field,
         long value,
         long minimum,
         long maximum) {

  if (value < minimum || value > maximum) {
   throw new IllegalArgumentException(
           field + " must be between " + minimum + " and " + maximum
   );
  }
 }
