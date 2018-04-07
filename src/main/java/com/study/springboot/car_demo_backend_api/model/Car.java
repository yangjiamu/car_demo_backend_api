package com.study.springboot.car_demo_backend_api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;
}
