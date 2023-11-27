package tn.esprit.demo.services;

import jakarta.persistence.EntityNotFoundException;
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
    public Etudiant updateEtudiantWithParm(long id, Etudiant etudiant) {
        // Vérifier si l'étudiant existe avant de le mettre à jour
        if (etudiantRepository.existsById(id)) {
            etudiant.setIdEtudiant(id);
            return etudiantRepository.save(etudiant);
        } else {
            // Gérer le cas où l'étudiant n'existe pas
            throw new EntityNotFoundException("Etudiant avec l'ID " + id + " non trouvé.");
        }
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
