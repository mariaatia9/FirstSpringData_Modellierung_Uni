/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity.unidirektional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class City {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;
    private String cityName;
    private String zipCode;

    public City() {
    }

    public City(String cityName, String zipCode) {
        this.cityName = cityName;
        this.zipCode = zipCode;
    }
    
    
}
