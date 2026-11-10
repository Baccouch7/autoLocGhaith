package tn.esprit.spring.service;

import tn.esprit.spring.entity.StatutVehicule;
import tn.esprit.spring.entity.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface IVehiculeService {
    Vehicule create(Vehicule vehicule);

    Vehicule getById(Long id);

    List<Vehicule> getAll();

    Vehicule update(Vehicule vehicule);

    void delete(Long id);
    Vehicule affecterEquipementVehicule(Long idVehicule, Long idEquipement);
    // 1
    List<Vehicule> findByMarque(String marque);
    // 2
    List<Vehicule> findByMarqueContaining(String mot);
    // 3
    List<Vehicule> findByMarqueStartingWith(String prefix);
    // 4
    List<Vehicule> findByMarqueEndingWith(String suffix);
    // 5
    List<Vehicule> findByMarqueIgnoreCase(String marque);
    // 6
    List<Vehicule> findByModele(String modele);
    // 7
    boolean existsByImmatriculation(String immatriculation);
    // 8
    long countByMarque(String marque);
    // 9
    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);
    // 10
    List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif);
    // 11
    List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif);
    // 12
    List<Vehicule> findByTarifJournalierBetween(BigDecimal min, BigDecimal max);
    // 13
    List<Vehicule> findByOrderByTarifJournalierAsc();
    // 14
    List<Vehicule> findByOrderByTarifJournalierDesc();
    // 15
    List<Vehicule> findByMarqueOrderByTarifJournalierAsc(String marque);
    // 16
    List<Vehicule> findByMarqueAndTarifJournalierGreaterThan(String marque, BigDecimal tarif);
    // 17
    List<Vehicule> findByMarqueOrModele(String marque, String modele);
    // 18
    List<Vehicule> findByMarqueIn(List<String> marques);
    // 19
    List<Vehicule> findByMarqueNotIn(List<String> marques);
    // 20
    List<Vehicule> findByStatut(StatutVehicule statut);
    // 21
    List<Vehicule> findByStatutOrderByTarifJournalierAsc(StatutVehicule statut);
    // 22
    List<Vehicule> findByAgenceIdAgence(Long idAgence);
    // 23
    List<Vehicule> findByAgenceVille(String ville);
    // 24
    List<Vehicule> findByAgenceNomContaining(String nom);
    // 25
    List<Vehicule> findByAgenceIdAgenceAndMarque(Long idAgence, String marque);
    // 26
    List<Vehicule> findByAgenceIsNull();
    // 27
    List<Vehicule> findByAgenceIsNotNull();
    // 28
    long countByAgenceIdAgence(Long idAgence);
    // 29
    boolean existsByAgenceIdAgence(Long idAgence);

}
