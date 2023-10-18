package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Foyer;

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
