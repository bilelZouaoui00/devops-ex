package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
}
