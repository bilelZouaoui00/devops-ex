package tn.esprit.demo.services;

import tn.esprit.demo.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite ajouterUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void supprimerUniversite(long idUniversite);
    Universite getUniversite(long idUniversite);
    List<Universite> getAllUniversites();
}
