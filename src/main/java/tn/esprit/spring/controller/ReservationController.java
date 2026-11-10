package tn.esprit.spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.service.IReservationService;

import java.util.List;

@Tag(name = "Gestion des réservations")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    IReservationService service;

    @Operation(description = "Ajouter une réservation")
    @PostMapping("/create")
    public Reservation create(@RequestBody Reservation reservation) {
        return service.create(reservation);
    }

    @Operation(description = "Obtenir une réservation par ID")
    @GetMapping("/get/{id}")
    public Reservation getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Operation(description = "Lister toutes les réservations")
    @GetMapping("/getAll")
    public List<Reservation> getAll() {
        return service.getAll();
    }

    @Operation(description = "Mettre à jour une réservation")
    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return service.update(reservation);
    }

    @Operation(description = "Supprimer une réservation")
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @Operation(description = "Affecter une réservation à un client")
    @PutMapping("/affecter-client/{idReservation}/{idClient}")
    public Reservation affecterReservationClient(@PathVariable Long idReservation, @PathVariable Long idClient) {
        return service.affecterReservationClient(idReservation, idClient);
    }

    @Operation(description = "Affecter un contrat à une réservation")
    @PutMapping("/affecter-contrat/{idReservation}/{idContrat}")
    public Reservation affecterReservationContrat(@PathVariable Long idReservation, @PathVariable Long idContrat) {
        return service.affecterReservationContrat(idReservation, idContrat);
    }
}