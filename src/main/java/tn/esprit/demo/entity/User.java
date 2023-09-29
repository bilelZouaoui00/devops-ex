package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//indicate that this class is an entity
@Entity
//Generate setter and getter automatically
@Setter
@Getter

//Serializable --> this class can be serializable and deserializable to enhance performance of
    // Sorting objects, Object transmission, Caching and Session Manager.
public class User implements Serializable {
    //specify the Primary Key
    @Id
    //identify the primary key and specify the strategy of PK that is auto-increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String cin;
    private String name;
    private String email ;
}
