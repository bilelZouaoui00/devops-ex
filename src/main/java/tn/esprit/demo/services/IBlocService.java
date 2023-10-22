package tn.esprit.demo.services;

import tn.esprit.demo.entity.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc ajouterBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void supprimerBloc(long idBloc);
    Bloc getBloc(long idBloc);
    List<Bloc> getAllBloc();
}
