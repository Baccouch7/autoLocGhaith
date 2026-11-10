package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Maintenance;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.repository.MaintenanceRepository;
import tn.esprit.spring.repository.VehiculeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class MaintenanceServiceIMPL implements IMaintenanceService {

    MaintenanceRepository maintenanceRepository;
    VehiculeRepository vehiculeRepository;

    @Override
    public Maintenance create(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance getById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void delete(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance affecterMaintenanceVehicule(Long idMaintenance, Long idVehicule) {
        //Donnee
        Maintenance maintenance = maintenanceRepository.findById(idMaintenance).orElse(null);
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).orElse(null);

        //Affectation
        assert maintenance != null;
        maintenance.setVehicule(vehicule);

        //save
        return maintenanceRepository.save(maintenance);
    }
}