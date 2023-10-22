package tn.esprit.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo.entity.Bloc;
import tn.esprit.demo.repositories.IBlocRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocServiceImpl implements IBlocService {

    final IBlocRepository blocRepository;

    @Override
    public Bloc ajouterBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void supprimerBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc getBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return (List<Bloc>) blocRepository.findAll();
    }
}
