package tn.esprit.demo.services;

import tn.esprit.demo.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void supprimerReservation(long idReservation);
    Reservation getReservation(long idReservation);
    List<Reservation> getAllReservations();
}
