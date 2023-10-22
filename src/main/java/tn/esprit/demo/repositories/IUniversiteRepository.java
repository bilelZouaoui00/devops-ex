package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Universite;

public interface IUniversiteRepository extends CrudRepository<Universite, Long> {
}
