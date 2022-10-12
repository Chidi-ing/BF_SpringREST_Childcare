package com.springrestchildcare.model.entities;

import lombok.*;

import javax.persistence.*;



@Entity
@Getter @Setter
@NoArgsConstructor //will generate a construtor with no parameters
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.TABLE) // incréments by table
    private Long id;

    @Column(nullable = false) // applies not null contraint to database column
    private String name;

    @Column(nullable = false)
    private String firstname;

    public Person(String name, String firstname){
        this.name = name;
        this.firstname = firstname;
    }
}
