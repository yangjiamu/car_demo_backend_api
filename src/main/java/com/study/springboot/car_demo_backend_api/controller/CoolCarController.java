package com.study.springboot.car_demo_backend_api.controller;

import com.study.springboot.car_demo_backend_api.model.Car;
import com.study.springboot.car_demo_backend_api.repository.CarRepository;
import com.study.springboot.car_demo_backend_api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoolCarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cool-cars")
    @CrossOrigin(origins = "http://localhost:4300")
    public List<Car> coolCars(){
        return carService.coolCars();
    }

}
