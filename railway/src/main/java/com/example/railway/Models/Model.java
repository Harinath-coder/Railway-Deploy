package com.example.railway.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String password;
    private String city;
    private String company;

}
