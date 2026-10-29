package tn.esprit.spring.service;

import tn.esprit.spring.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation create(Reservation reservation);

    Reservation getById(Long id);

    List<Reservation> getAll();

    Reservation update(Reservation reservation);

    void delete(Long id);
}
