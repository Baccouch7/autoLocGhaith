package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.repository.ReservationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceIMPL implements IReservationService {
    ReservationRepository repository;

    @Override
    public Reservation create(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public Reservation getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> getAll() {
        return repository.findAll();
    }

    @Override
    public Reservation update(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
