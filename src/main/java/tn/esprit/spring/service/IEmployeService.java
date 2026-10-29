package tn.esprit.spring.service;

import tn.esprit.spring.entity.Employe;

import java.util.List;

public interface IEmployeService {
    Employe create(Employe employe);

    Employe getById(Long id);

    List<Employe> getAll();

    Employe update(Employe employe);

    void delete(Long id);
}
