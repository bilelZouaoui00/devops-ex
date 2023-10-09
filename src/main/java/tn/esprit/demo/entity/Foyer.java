package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    //Mapped by in the child
    @OneToOne(mappedBy="foyer")
    private Universite universite;
    //@OneToMany
    //pour assurer que les doublant ne serar pas accepter
    //Set<Bloc> blocs;
}
