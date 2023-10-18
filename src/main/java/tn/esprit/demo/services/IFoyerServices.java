package tn.esprit.demo.services;

import tn.esprit.demo.entity.Foyer;

import java.util.List;

public interface IFoyerServices {
    Foyer ajouterFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    void supprimerFoyer(long idFoyer);
    Foyer getFoyer(long idFoyer);
    List<Foyer> getAllFoyer();
}
