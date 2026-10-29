package tn.esprit.spring.service;

import tn.esprit.spring.entity.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule create(Vehicule vehicule);

    Vehicule getById(Long id);

    List<Vehicule> getAll();

    Vehicule update(Vehicule vehicule);

    void delete(Long id);
}
