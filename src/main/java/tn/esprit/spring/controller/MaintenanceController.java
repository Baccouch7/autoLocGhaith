package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Maintenance;
import tn.esprit.spring.service.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/maintenance")
@AllArgsConstructor
public class MaintenanceController {

    IMaintenanceService maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.create(maintenance);
    }

    @GetMapping("/get/{id}")
    public Maintenance getMaintenance(@PathVariable Long id) {
        return maintenanceService.getById(id);
    }

    @GetMapping("/all")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAll();
    }

    @PutMapping("/update")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.update(maintenance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.delete(id);
    }

    @PutMapping("/affecter-vehicule/{idMaintenance}/{idVehicule}")
    public Maintenance affecterMaintenanceVehicule(@PathVariable Long idMaintenance, @PathVariable Long idVehicule) {
        return maintenanceService.affecterMaintenanceVehicule(idMaintenance, idVehicule);
    }
}