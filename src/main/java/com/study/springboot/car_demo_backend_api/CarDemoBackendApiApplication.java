package com.study.springboot.car_demo_backend_api;

import com.study.springboot.car_demo_backend_api.model.Car;
import com.study.springboot.car_demo_backend_api.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CarDemoBackendApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarDemoBackendApiApplication.class, args);
    }

    @Bean
    ApplicationRunner init(CarRepository carRepository){
        return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                    "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                carRepository.save(car);
            });
            carRepository.findAll().forEach(System.out::println);
        };
    }
}
