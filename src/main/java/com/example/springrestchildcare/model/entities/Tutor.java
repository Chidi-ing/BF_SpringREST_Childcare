package com.example.springrestchildcare.model.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity //entity JPA
@Getter @Setter
@NoArgsConstructor
public class Tutor extends Person {

    @Column(nullable = false)
    private String numTel;

    @ManyToMany(mappedBy = "tutors")
    private Set<Child> childs;

}
