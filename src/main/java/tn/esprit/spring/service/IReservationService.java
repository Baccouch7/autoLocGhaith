package tn.esprit.spring.service;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation create(Reservation reservation);

    Reservation getById(Long id);

    List<Reservation> getAll();

    Reservation update(Reservation reservation);

    void delete(Long id);

    Reservation affecterReservationClient(Long idReservation, Long idClient);

    Reservation affecterReservationContrat(Long idReservation, Long idContrat);
}
