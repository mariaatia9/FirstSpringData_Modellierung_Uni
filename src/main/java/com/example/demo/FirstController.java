/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;


import com.example.entity.unidirektional.Addresse;
import com.example.entity.unidirektional.City;
import com.example.repository.PersonRepository;
import com.example.entity.unidirektional.Person;
import com.example.repository.AdressRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author trainer
 */
@RestController
@RequestMapping(path = "/api")
public class FirstController {
    
    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    AdressRepository adressRepository;
    
    @GetMapping(path = "/create")
    public String doCreateData(){
        Person p=new Person("Hans","Mustermann");
        City c=new City("München","23456");
        Addresse a =new Addresse(c,"Sandberg");
      
          c=new City("Berlin","34561");
         Addresse a1 =new Addresse(c,"Sandberg");
     
        p.getAdressen().add(a);
        p.getAdressen().add(a1);
        //schreibende Zugriff
        personRepository.save(p);
        //personRepository.flush();
        return "Data created";
    }
    
    @GetMapping(path="/read")
    public String doRead(){
        List<Addresse> la=adressRepository.findAll();
        for(Addresse a:la){
            System.out.println("Objekt:"+ a);
        }
        
        
        return "Data Read";
    }
    
    
}
