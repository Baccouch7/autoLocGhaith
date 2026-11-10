package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.service.IVehiculeService;
import tn.esprit.spring.entity.StatutVehicule;
import java.math.BigDecimal;
import java.util.List;
import java.util.List;

@RestController
@RequestMapping("/vehicule")
@AllArgsConstructor
public class VehiculeController {

    IVehiculeService vehiculeService;

    @PostMapping("/add")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.create(vehicule);
    }

    @GetMapping("/get/{id}")
    public Vehicule getVehicule(@PathVariable Long id) {
        return vehiculeService.getById(id);
    }

    @GetMapping("/all")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAll();
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.update(vehicule);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.delete(id);
    }

    @PutMapping("/affecter-equipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipementVehicule(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipementVehicule(idVehicule, idEquipement);
    }
    // 1
    @GetMapping("/findByMarque/{marque}")
    public List<Vehicule> findByMarque(@PathVariable String marque) {
        return vehiculeService.findByMarque(marque);
    }

    // 2
    @GetMapping("/findByMarqueContaining/{mot}")
    public List<Vehicule> findByMarqueContaining(@PathVariable String mot) {
        return vehiculeService.findByMarqueContaining(mot);
    }

    // 3
    @GetMapping("/findByMarqueStartingWith/{prefix}")
    public List<Vehicule> findByMarqueStartingWith(@PathVariable String prefix) {
        return vehiculeService.findByMarqueStartingWith(prefix);
    }

    // 4
    @GetMapping("/findByMarqueEndingWith/{suffix}")
    public List<Vehicule> findByMarqueEndingWith(@PathVariable String suffix) {
        return vehiculeService.findByMarqueEndingWith(suffix);
    }

    // 5
    @GetMapping("/findByMarqueIgnoreCase/{marque}")
    public List<Vehicule> findByMarqueIgnoreCase(@PathVariable String marque) {
        return vehiculeService.findByMarqueIgnoreCase(marque);
    }

    // 6
    @GetMapping("/findByModele/{modele}")
    public List<Vehicule> findByModele(@PathVariable String modele) {
        return vehiculeService.findByModele(modele);
    }

    // 7
    @GetMapping("/existsByImmatriculation/{immatriculation}")
    public boolean existsByImmatriculation(@PathVariable String immatriculation) {
        return vehiculeService.existsByImmatriculation(immatriculation);
    }

    // 8
    @GetMapping("/countByMarque/{marque}")
    public long countByMarque(@PathVariable String marque) {
        return vehiculeService.countByMarque(marque);
    }

    // 9
    @GetMapping("/findByTarifGreaterThan/{tarif}")
    public List<Vehicule> findByTarifGreaterThan(@PathVariable BigDecimal tarif) {
        return vehiculeService.findByTarifJournalierGreaterThan(tarif);
    }

    // 10
    @GetMapping("/findByTarifLessThan/{tarif}")
    public List<Vehicule> findByTarifLessThan(@PathVariable BigDecimal tarif) {
        return vehiculeService.findByTarifJournalierLessThan(tarif);
    }

    // 11
    @GetMapping("/findByTarifGreaterThanEqual/{tarif}")
    public List<Vehicule> findByTarifGreaterThanEqual(@PathVariable BigDecimal tarif) {
        return vehiculeService.findByTarifJournalierGreaterThanEqual(tarif);
    }

    // 12
    @GetMapping("/findByTarifBetween/{min}/{max}")
    public List<Vehicule> findByTarifBetween(@PathVariable BigDecimal min, @PathVariable BigDecimal max) {
        return vehiculeService.findByTarifJournalierBetween(min, max);
    }

    // 13
    @GetMapping("/findByOrderByTarifAsc")
    public List<Vehicule> findByOrderByTarifAsc() {
        return vehiculeService.findByOrderByTarifJournalierAsc();
    }

    // 14
    @GetMapping("/findByOrderByTarifDesc")
    public List<Vehicule> findByOrderByTarifDesc() {
        return vehiculeService.findByOrderByTarifJournalierDesc();
    }

    // 15
    @GetMapping("/findByMarqueOrderByTarifAsc/{marque}")
    public List<Vehicule> findByMarqueOrderByTarifAsc(@PathVariable String marque) {
        return vehiculeService.findByMarqueOrderByTarifJournalierAsc(marque);
    }

    // 16
    @GetMapping("/findByMarqueAndTarifGreaterThan/{marque}/{tarif}")
    public List<Vehicule> findByMarqueAndTarifGreaterThan(@PathVariable String marque, @PathVariable BigDecimal tarif) {
        return vehiculeService.findByMarqueAndTarifJournalierGreaterThan(marque, tarif);
    }

    // 17
    @GetMapping("/findByMarqueOrModele/{marque}/{modele}")
    public List<Vehicule> findByMarqueOrModele(@PathVariable String marque, @PathVariable String modele) {
        return vehiculeService.findByMarqueOrModele(marque, modele);
    }

    // 18
    @PostMapping("/findByMarqueIn")
    public List<Vehicule> findByMarqueIn(@RequestBody List<String> marques) {
        return vehiculeService.findByMarqueIn(marques);
    }

    // 19
    @PostMapping("/findByMarqueNotIn")
    public List<Vehicule> findByMarqueNotIn(@RequestBody List<String> marques) {
        return vehiculeService.findByMarqueNotIn(marques);
    }

    // 20
    @GetMapping("/findByStatut/{statut}")
    public List<Vehicule> findByStatut(@PathVariable StatutVehicule statut) {
        return vehiculeService.findByStatut(statut);
    }

    // 21
    @GetMapping("/findByStatutOrderByTarifAsc/{statut}")
    public List<Vehicule> findByStatutOrderByTarifAsc(@PathVariable StatutVehicule statut) {
        return vehiculeService.findByStatutOrderByTarifJournalierAsc(statut);
    }

    // 22
    @GetMapping("/findByAgence/{idAgence}")
    public List<Vehicule> findByAgence(@PathVariable Long idAgence) {
        return vehiculeService.findByAgenceIdAgence(idAgence);
    }

    // 23
    @GetMapping("/findByAgenceVille/{ville}")
    public List<Vehicule> findByAgenceVille(@PathVariable String ville) {
        return vehiculeService.findByAgenceVille(ville);
    }

    // 24
    @GetMapping("/findByAgenceNomContaining/{nom}")
    public List<Vehicule> findByAgenceNomContaining(@PathVariable String nom) {
        return vehiculeService.findByAgenceNomContaining(nom);
    }

    // 25
    @GetMapping("/findByAgenceAndMarque/{idAgence}/{marque}")
    public List<Vehicule> findByAgenceAndMarque(@PathVariable Long idAgence, @PathVariable String marque) {
        return vehiculeService.findByAgenceIdAgenceAndMarque(idAgence, marque);
    }

    // 26
    @GetMapping("/findByAgenceIsNull")
    public List<Vehicule> findByAgenceIsNull() {
        return vehiculeService.findByAgenceIsNull();
    }

    // 27
    @GetMapping("/findByAgenceIsNotNull")
    public List<Vehicule> findByAgenceIsNotNull() {
        return vehiculeService.findByAgenceIsNotNull();
    }

    // 28
    @GetMapping("/countByAgence/{idAgence}")
    public long countByAgence(@PathVariable Long idAgence) {
        return vehiculeService.countByAgenceIdAgence(idAgence);
    }

    // 29
    @GetMapping("/existsByAgence/{idAgence}")
    public boolean existsByAgence(@PathVariable Long idAgence) {
        return vehiculeService.existsByAgenceIdAgence(idAgence);
    }
}