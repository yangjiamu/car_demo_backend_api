package com.study.springboot.car_demo_backend_api.repository;

import com.study.springboot.car_demo_backend_api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin(origins = "http://localhost:4300")
public interface CarRepository extends JpaRepository<Car, Long> {
}
