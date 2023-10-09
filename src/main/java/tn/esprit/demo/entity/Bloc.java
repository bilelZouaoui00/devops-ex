package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Setter
@Getter
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    Chambre chambres;
    @ManyToOne
    Foyer foyer;

}
