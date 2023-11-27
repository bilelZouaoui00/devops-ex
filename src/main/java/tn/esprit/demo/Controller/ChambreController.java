package tn.esprit.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo.entity.Chambre;
import tn.esprit.demo.services.ChambreServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    private final ChambreServiceImpl chambreService;

    @Autowired
    public ChambreController(ChambreServiceImpl chambreService) {
        this.chambreService = chambreService;
    }

    @PostMapping("/ajouter")
    public void ajouterChambre(@RequestBody Chambre chambre) {
        chambreService.ajouterChambre(chambre);
    }

    @PutMapping("/modifier")
    public void modifierChambre(@RequestBody Chambre chambre) {
        chambreService.updateChambre(chambre);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimerChambre(@PathVariable long id) {
        chambreService.supprimerChambre(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable long id) {
        Chambre chambre = chambreService.getChambre(id);
        return ResponseEntity.ok(chambre);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Chambre>> getAllChambres() {
        List<Chambre> chambres = chambreService.getAllChambre();
        return ResponseEntity.ok(chambres);
    }
}

