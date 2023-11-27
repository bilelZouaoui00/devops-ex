package tn.esprit.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entity.Reservation;
import tn.esprit.demo.services.ReservationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationServiceImpl reservationService;

    @Autowired
    public ReservationController(ReservationServiceImpl reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/ajouter")
    public void ajouterReservation(@RequestBody Reservation reservation) {
        reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifier")
    public void modifierReservation(@RequestBody Reservation reservation) {
        reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerReservation(@PathVariable long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable long id) {
        Reservation reservation = reservationService.getReservation(id);
        return ResponseEntity.ok(reservation);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        return ResponseEntity.ok(reservations);
    }
}

