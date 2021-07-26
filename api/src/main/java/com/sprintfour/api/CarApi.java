package com.sprintfour.api;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server;

@RestController
//@RequestMapping("/cars")
public class CarApi {

    @Autowired
    CarRepository repo;

    @GetMapping("/cars")
    public List<Car> getAllCars(){
        return repo.findAll();
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable UUID id){
        return repo.getById(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return repo.save(car);
    }

    @PostMapping("/cars/year")
    public Car updateYear(@PathVariable UUID id, @RequestBody Car car) {
        Car carToEdit = repo.findById(id).orElse(null);

        if(carToEdit == null) {
            throw new ReponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        }

        carToEdit.setYear(car.getYear());
        return repo.save(carToEdit);
    }

    @PostMapping("/cars/make")
    public Car updateMake(@PathVariable UUID id, @RequestBody Car car) {
        Car carToEdit = repo.findById(id).orElse(null);

        if(carToEdit == null) {
            throw new ReponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        }

        carToEdit.setMake(car.getMake());
        return repo.save(carToEdit);
    }

    @PostMapping("/cars/model")
    public Car updateModel(@PathVariable UUID id, @RequestBody Car car) {
        Car carToEdit = repo.findById(id).orElse(null);

        if(carToEdit == null) {
            throw new ReponseStatusException(HttpStatus.NOT_FOUND, "Car not found");
        }

        carToEdit.setModel(car.getModel());
        return repo.save(carToEdit);
    }





}


