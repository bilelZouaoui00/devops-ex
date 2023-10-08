package tn.esprit.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

import tn.esprit.demo.entity.TypeChambre;

@Entity
@Setter
@Getter
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private long numeroChambre;
    private TypeChambre typeC;

    @OneToMany
    Set<Reservation> reservations;

}
