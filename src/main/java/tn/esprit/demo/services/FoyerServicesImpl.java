package tn.esprit.demo.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Foyer;
import tn.esprit.demo.repositories.IFoyerRepository;
import tn.esprit.demo.repositories.IUniversiteRepository;

import java.util.ArrayList;
import java.util.List;

@Service

//assurer le couplage faible : par l'interface , l'objcetif de couplage pour minimiser le dépendance.
    //en injecte le service par interface
    //pas forcement de l'interface dans la classe , mais si en injecte dans une autres classe en
        //utilise l'intreface

//conflis entre deux classe  ????????????????????????????????????????????????????????????????????????????????,,,

//il faut assurer le couplage fiable entre les controller et service et reposilory

//@AllArgsConstructor
    // pour mettre tous les attributs -----> Vérifier
    //si all en élimine le final

@RequiredArgsConstructor //en mettre le fial

// meilleur recommander c'est le constructor


public class FoyerServicesImpl implements  IFoyerServices{

    //@Autowired //pour le cablage automatique avec IfoyerRepository et IFoyerServices
    //@Autowired -> l'injection sa marche pour la premiére instruction
    //ou cette méthode, avec le constructeur paramétrer
    final IFoyerRepository foyerRepository; //mais elle va étre semettre a null, et en doit indiquer quelle
        //est une instance qui doit étre initialiser donc en mettre comme final :
        //final IFoyerRepository foyerRepository; //doit étre initialiser
    final IUniversiteRepository universiteRepository;
    //aprés le mettre finale en élimine ce code :
    //public FoyerServicesImpl(IFoyerRepository foyerRepository){
    //  this.foyerRepository = foyerRepository;
    //}
    @Override
    public Foyer ajouterFoyer(Foyer f) {
        return foyerRepository.save(f) ;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public void supprimerFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer getFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public List <Foyer> getAllFoyer() {
        //List <Foyer> foyers= new ArrayList<>();
        //return foyerRepository.findAll().forEach(e -> {});
        return (List<Foyer>) foyerRepository.findAll();
    }
}
