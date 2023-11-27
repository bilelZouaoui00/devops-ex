package tn.esprit.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entity.Foyer;
import tn.esprit.demo.services.FoyerServicesImpl;

import java.util.List;

@RestController
    @RequestMapping("/foyer")
    public class FoyerController {

        private final FoyerServicesImpl foyerService;

        @Autowired
        public FoyerController(FoyerServicesImpl foyerService) {
            this.foyerService = foyerService;
        }

        @PostMapping("/ajouter")
        public void ajouterFoyer(@RequestBody Foyer foyer) {
            foyerService.ajouterFoyer(foyer);
        }

        @PutMapping("/modifier")
        public void modifierFoyer(@RequestBody Foyer foyer) {
            foyerService.updateFoyer(foyer);
        }

        @DeleteMapping("/supprimer/{id}")
        public void supprimerFoyer(@PathVariable long id) {
            foyerService.supprimerFoyer(id);
        }

        @GetMapping("/get/{id}")
        public ResponseEntity<Foyer> getFoyerById(@PathVariable long id) {
            Foyer foyer = foyerService.getFoyer(id);
            return ResponseEntity.ok(foyer);
        }

        @GetMapping("/getAll")
        public ResponseEntity<List<Foyer>> getAllFoyers() {
            List<Foyer> foyers = foyerService.getAllFoyer();
            return ResponseEntity.ok(foyers);
        }
    }

