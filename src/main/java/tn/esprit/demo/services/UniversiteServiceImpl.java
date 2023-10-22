package tn.esprit.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Universite;
import tn.esprit.demo.repositories.IUniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    final IUniversiteRepository universiteRepository;

    @Override
    public Universite ajouterUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void supprimerUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite getUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }
}
