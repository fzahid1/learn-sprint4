package com.sprintfour.api;
import org.springframework.web.bind.annotation.*;

@RestController
public class SnacksController {

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return name;
    } 
    @PostMapping("/snack")
    public Snack getSnack(){
        return new Snack("lewis is a baller, Mary stinks","Lewis is cool", "Mary isn't");
    } 


}