package tn.esprit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo.entity.Bloc;

public interface IBlocRepository extends CrudRepository<Bloc, Long> {
}
