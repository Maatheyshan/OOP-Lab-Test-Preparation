package edu.practice.dispatch.controller;
import edu.practice.dispatch.service.*;
import edu.practice.dispatch.model.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController @RequestMapping("/missions")
public class DispatchController {
 private final DispatchService service;

 public DispatchController(DispatchService service){
  this.service=service;
 }

 @GetMapping public Collection<DispatchMission> all(){
  return service.all();
 }
 // TODO Task 4: GET /{id}/energy; POST /air (HTTP 201);
 // GET /plan?capacity=...&urgentOnly=false; delegate all logic to service.
}
