package tn.esprit.spring.service;

import tn.esprit.spring.entity.Contrat;

import java.util.List;

public interface IContratService {
    Contrat create(Contrat contrat);

    Contrat getById(Long id);

    List<Contrat> getAll();

    Contrat update(Contrat contrat);

    void delete(Long id);
}
