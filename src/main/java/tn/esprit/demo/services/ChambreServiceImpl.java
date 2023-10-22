package tn.esprit.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Chambre;
import tn.esprit.demo.repositories.IChambreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    final IChambreRepository chambreRepository;

    @Override
    public Chambre ajouterChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void supprimerChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre getChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return (List<Chambre>) chambreRepository.findAll();
    }
}
