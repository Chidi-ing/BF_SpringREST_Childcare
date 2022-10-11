package com.example.springrestchildcare.model.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Child extends Person {

    private LocalDate DateOfBirth;
    private boolean clean;

    @ElementCollection(fetch = FetchType.EAGER) //fetches the data with master other datas
    private List<String> allergies;

    /*
    @ManyToMany
    @JoinTable(
            name = "child_tutor",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "tutor_id")
    )
    private Set<Tutor> tut
*/
}
