package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.AgenceRepository;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceIMPL implements IEmployeService {


    EmployeRepository employeRepository;
    AgenceRepository agenceRepository;

    @Override
    public Employe create(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> getAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void delete(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe affecterAgenceEmploye(Long idAgence, Long idEmploye) {
        //Donnee
        Employe employe = employeRepository.findById(idEmploye).orElse(null);
        Agence agence = agenceRepository.findById(idAgence).orElse(null);
        //Affectation
        assert employe != null;
        employe.setAgence(agence);
        //save
        return employeRepository.save(employe);
        }


}