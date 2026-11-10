package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.ReservationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceIMPL implements IReservationService {

    ReservationRepository repository;
    ClientRepository clientRepository;
    ContratRepository contratRepository;

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

    // ============================================================
    // Affecter une réservation à un client
    // ============================================================
    @Override
    public Reservation affecterReservationClient(Long idReservation, Long idClient) {
        //Donnee
        Reservation reservation = repository.findById(idReservation).orElse(null);
        Client client = clientRepository.findById(idClient).orElse(null);

        //Affectation
        assert reservation != null;
        reservation.setClient(client);

        //save
        return repository.save(reservation);
    }

    // ============================================================
    // Affecter un contrat à une réservation
    // ============================================================
    @Override
    public Reservation affecterReservationContrat(Long idReservation, Long idContrat) {
        //Donnee
        Reservation reservation = repository.findById(idReservation).orElse(null);
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);

        //Affectation
        assert reservation != null;
        assert contrat != null;
        contrat.setReservation(reservation);

        //save
        contratRepository.save(contrat);
        return repository.save(reservation);
    }
}