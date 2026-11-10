package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Equipement;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.repository.EquipementRepository;
import tn.esprit.spring.repository.VehiculeRepository;
import tn.esprit.spring.entity.StatutVehicule;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeServiceIMPL implements IVehiculeService {

    VehiculeRepository vehiculeRepository;
    EquipementRepository equipementRepository;

    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void delete(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule affecterEquipementVehicule(Long idVehicule, Long idEquipement) {
        //Donnee
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);
        Equipement equipement = equipementRepository.findById(idEquipement).orElse(null);

        //Affectation
        assert vehicule != null;
        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new ArrayList<>());
        }
        vehicule.getEquipements().add(equipement);

        //save
        return vehiculeRepository.save(vehicule);
    }
    // 1
    @Override
    public List<Vehicule> findByMarque(String marque) {
        return vehiculeRepository.findByMarque(marque);
    }

    // 2
    @Override
    public List<Vehicule> findByMarqueContaining(String mot) {
        return vehiculeRepository.findByMarqueContaining(mot);
    }

    // 3
    @Override
    public List<Vehicule> findByMarqueStartingWith(String prefix) {
        return vehiculeRepository.findByMarqueStartingWith(prefix);
    }

    // 4
    @Override
    public List<Vehicule> findByMarqueEndingWith(String suffix) {
        return vehiculeRepository.findByMarqueEndingWith(suffix);
    }

    // 5
    @Override
    public List<Vehicule> findByMarqueIgnoreCase(String marque) {
        return vehiculeRepository.findByMarqueIgnoreCase(marque);
    }

    // 6
    @Override
    public List<Vehicule> findByModele(String modele) {
        return vehiculeRepository.findByModele(modele);
    }

    // 7
    @Override
    public boolean existsByImmatriculation(String immatriculation) {
        return vehiculeRepository.existsByImmatriculation(immatriculation);
    }

    // 8
    @Override
    public long countByMarque(String marque) {
        return vehiculeRepository.countByMarque(marque);
    }

    // 9
    @Override
    public List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThan(tarif);
    }

    // 10
    @Override
    public List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierLessThan(tarif);
    }

    // 11
    @Override
    public List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThanEqual(tarif);
    }

    // 12
    @Override
    public List<Vehicule> findByTarifJournalierBetween(BigDecimal min, BigDecimal max) {
        return vehiculeRepository.findByTarifJournalierBetween(min, max);
    }

    // 13
    @Override
    public List<Vehicule> findByOrderByTarifJournalierAsc() {
        return vehiculeRepository.findByOrderByTarifJournalierAsc();
    }

    // 14
    @Override
    public List<Vehicule> findByOrderByTarifJournalierDesc() {
        return vehiculeRepository.findByOrderByTarifJournalierDesc();
    }

    // 15
    @Override
    public List<Vehicule> findByMarqueOrderByTarifJournalierAsc(String marque) {
        return vehiculeRepository.findByMarqueOrderByTarifJournalierAsc(marque);
    }

    // 16
    @Override
    public List<Vehicule> findByMarqueAndTarifJournalierGreaterThan(String marque, BigDecimal tarif) {
        return vehiculeRepository.findByMarqueAndTarifJournalierGreaterThan(marque, tarif);
    }

    // 17
    @Override
    public List<Vehicule> findByMarqueOrModele(String marque, String modele) {
        return vehiculeRepository.findByMarqueOrModele(marque, modele);
    }

    // 18
    @Override
    public List<Vehicule> findByMarqueIn(List<String> marques) {
        return vehiculeRepository.findByMarqueIn(marques);
    }

    // 19
    @Override
    public List<Vehicule> findByMarqueNotIn(List<String> marques) {
        return vehiculeRepository.findByMarqueNotIn(marques);
    }

    // 20
    @Override
    public List<Vehicule> findByStatut(StatutVehicule statut) {
        return vehiculeRepository.findByStatut(statut);
    }

    // 21
    @Override
    public List<Vehicule> findByStatutOrderByTarifJournalierAsc(StatutVehicule statut) {
        return vehiculeRepository.findByStatutOrderByTarifJournalierAsc(statut);
    }

    // 22
    @Override
    public List<Vehicule> findByAgenceIdAgence(Long idAgence) {
        return vehiculeRepository.findByAgenceIdAgence(idAgence);
    }

    // 23
    @Override
    public List<Vehicule> findByAgenceVille(String ville) {
        return vehiculeRepository.findByAgenceVille(ville);
    }

    // 24
    @Override
    public List<Vehicule> findByAgenceNomContaining(String nom) {
        return vehiculeRepository.findByAgenceNomContaining(nom);
    }

    // 25
    @Override
    public List<Vehicule> findByAgenceIdAgenceAndMarque(Long idAgence, String marque) {
        return vehiculeRepository.findByAgenceIdAgenceAndMarque(idAgence, marque);
    }

    // 26
    @Override
    public List<Vehicule> findByAgenceIsNull() {
        return vehiculeRepository.findByAgenceIsNull();
    }

    // 27
    @Override
    public List<Vehicule> findByAgenceIsNotNull() {
        return vehiculeRepository.findByAgenceIsNotNull();
    }

    // 28
    @Override
    public long countByAgenceIdAgence(Long idAgence) {
        return vehiculeRepository.countByAgenceIdAgence(idAgence);
    }

    // 29
    @Override
    public boolean existsByAgenceIdAgence(Long idAgence) {
        return vehiculeRepository.existsByAgenceIdAgence(idAgence);
    }
}