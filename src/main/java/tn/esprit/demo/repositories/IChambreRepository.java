package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Chambre;

public interface IChambreRepository extends CrudRepository<Chambre, Long> {
}
