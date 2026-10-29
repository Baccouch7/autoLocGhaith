package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceIMPL implements IEmployeService {
    EmployeRepository repository;

    @Override
    public Employe create(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public Employe getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> getAll() {
        return repository.findAll();
    }

    @Override
    public Employe update(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
