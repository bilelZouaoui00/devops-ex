package tn.esprit.demo.services;

import tn.esprit.demo.entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre ajouterChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void supprimerChambre(long idChambre);
    Chambre getChambre(long idChambre);
    List<Chambre> getAllChambre();
}
