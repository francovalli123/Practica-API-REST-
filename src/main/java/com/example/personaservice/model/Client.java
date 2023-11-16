package com.example.personaservice.model;


import jakarta.persistence.*;
import lombok.Data;

import java.beans.ConstructorProperties;

@Data
@Entity
@Table(name="clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name="last_name")
    private String lastName;
    @Column(name="doc_number")
    private String docNumber;

}
