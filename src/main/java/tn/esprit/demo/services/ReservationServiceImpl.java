package tn.esprit.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Reservation;
import tn.esprit.demo.repositories.IReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    final IReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation getReservation(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }
}
