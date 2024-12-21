package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Koala {
    private Integer id;
    private String name;
    private Double sleepHour;
    private Double weight;
    private String gender;
}
