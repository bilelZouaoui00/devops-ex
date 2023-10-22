package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Reservation;

public interface IReservationRepository extends CrudRepository<Reservation, Long> {
}
