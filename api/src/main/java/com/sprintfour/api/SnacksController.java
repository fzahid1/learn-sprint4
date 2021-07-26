package com.sprintfour.api;
import org.springframework.web.bind.annotation.*;

import jdk.jfr.internal.Repository;

@RestController
public class SnacksController {

    // Read by ID
    @GetMapping("/{id}")
    public String readById(@PathVariable String name){
        return repository.findById(id).orElse(null);
    } 

     // Read by name
     @GetMapping("/{name}")
     public String readByName(@PathVariable String name){
         return repository.findByName(name).orElse(null);
     } 

    // Create
    @PostMapping
    public Snack createSnack(@RequestBody Snack snack){
        return repository.save[snack];
    } 

  
    // Update 
    @
}