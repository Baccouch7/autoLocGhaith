package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.repository.ContratRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceIMPL implements IContratService {
    ContratRepository repository;

    @Override
    public Contrat create(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public Contrat getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> getAll() {
        return repository.findAll();
    }

    @Override
    public Contrat update(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
