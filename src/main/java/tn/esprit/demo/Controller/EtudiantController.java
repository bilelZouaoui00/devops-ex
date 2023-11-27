package tn.esprit.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entity.Etudiant;
import tn.esprit.demo.services.EtudiantServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    private final EtudiantServiceImpl etudiantService;

    @Autowired
    public EtudiantController(EtudiantServiceImpl etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping("/ajouter")
    public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.ajouterEtudiant(etudiant);
    }

    @PutMapping("/modifier")
    public void modifierEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.updateEtudiant(etudiant);
    }
    @PutMapping("/modifier/{id}")
    public void modifierEtudiantWithParam(@PathVariable long id,@RequestBody Etudiant etudiant) {
        etudiantService.updateEtudiantWithParm(id,etudiant);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerEtudiant(@PathVariable long id) {
        etudiantService.supprimerEtudiant(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable long id) {
        Etudiant etudiant = etudiantService.getEtudiant(id);
        return ResponseEntity.ok(etudiant);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Etudiant>> getAllEtudiants() {
        List<Etudiant> etudiants = etudiantService.getAllEtudiant();
        return ResponseEntity.ok(etudiants);
    }
}

