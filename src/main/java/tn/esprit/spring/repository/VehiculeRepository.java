package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.StatutVehicule;
import tn.esprit.spring.entity.Vehicule;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    List<Vehicule> findByMarque(String marque);
    List<Vehicule> findByMarqueContaining(String mot);
    List<Vehicule> findByMarqueStartingWith(String prefix);
    List<Vehicule> findByMarqueIgnoreCase(String marque);
    List<Vehicule> findByMarqueEndingWith(String suffix);
    List<Vehicule> findByModele(String modele);
    boolean existsByImmatriculation(String immatriculation);
    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);
    long countByMarque(String marque);
    List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif);
    List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif);
    List<Vehicule> findByTarifJournalierBetween(BigDecimal min, BigDecimal max);
    List<Vehicule> findByOrderByTarifJournalierAsc();
    List<Vehicule> findByOrderByTarifJournalierDesc();
    List<Vehicule> findByMarqueOrderByTarifJournalierAsc(String marque);
    List<Vehicule> findByMarqueOrModele(String marque, String modele);
    List<Vehicule> findByMarqueAndTarifJournalierGreaterThan(String marque, BigDecimal tarif);
    List<Vehicule> findByMarqueIn(List<String> marques);
    List<Vehicule> findByMarqueNotIn(List<String> marques);
    List<Vehicule> findByStatut(StatutVehicule statut);
    List<Vehicule> findByStatutOrderByTarifJournalierAsc(StatutVehicule statut);
    List<Vehicule> findByAgenceIdAgence(Long idAgence);
    List<Vehicule> findByAgenceNomContaining(String nom);
    List<Vehicule> findByAgenceVille(String ville);
    List<Vehicule> findByAgenceIsNull();
    List<Vehicule> findByAgenceIdAgenceAndMarque(Long idAgence, String marque);
    long countByAgenceIdAgence(Long idAgence);
    List<Vehicule> findByAgenceIsNotNull();
    boolean existsByAgenceIdAgence(Long idAgence);














}

