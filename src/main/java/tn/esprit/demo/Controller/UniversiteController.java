package tn.esprit.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entity.Universite;
import tn.esprit.demo.services.UniversiteServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {

    private final UniversiteServiceImpl universiteService;

    @Autowired
    public UniversiteController(UniversiteServiceImpl universiteService) {
        this.universiteService = universiteService;
    }

    @PostMapping("/ajouter")
    public void ajouterUniversite(@RequestBody Universite universite) {
        universiteService.ajouterUniversite(universite);
    }

    @PutMapping("/modifier")
    public void modifierUniversite(@RequestBody Universite universite) {
        universiteService.updateUniversite(universite);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerUniversite(@PathVariable long id) {
        universiteService.supprimerUniversite(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Universite> getUniversiteById(@PathVariable long id) {
        Universite universite = universiteService.getUniversite(id);
        return ResponseEntity.ok(universite);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Universite>> getAllUniversites() {
        List<Universite> universites = universiteService.getAllUniversites();
        return ResponseEntity.ok(universites);
    }
}

