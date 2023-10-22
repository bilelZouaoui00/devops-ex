package tn.esprit.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Etudiant;
import tn.esprit.demo.repositories.IEtudiantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    final IEtudiantRepository etudiantRepository;

    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void supprimerEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant getEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }
}
