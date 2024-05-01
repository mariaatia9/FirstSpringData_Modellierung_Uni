/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity.unidirektional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class Addresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    @OneToOne(cascade = CascadeType.ALL)
    private City city;
    private String street;

    public Addresse() {
    }
    
    

    public Addresse(City city, String street) {
        this.city = city;
        this.street = street;
    }
    
    
    
}
