package tn.esprit.demo.services;

import tn.esprit.demo.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant ajouterEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void supprimerEtudiant(long idEtudiant);
    Etudiant getEtudiant(long idEtudiant);
    List<Etudiant> getAllEtudiant();
}
