package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Equipement;
import tn.esprit.spring.repository.EquipementRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipementServiceIMPL implements IEquipementService {
    EquipementRepository repository;

    @Override
    public Equipement create(Equipement equipement) {
        return repository.save(equipement);
    }

    @Override
    public Equipement getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Equipement> getAll() {
        return repository.findAll();
    }

    @Override
    public Equipement update(Equipement equipement) {
        return repository.save(equipement);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
