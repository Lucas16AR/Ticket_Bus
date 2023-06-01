package com.ticker.ticket_bus.services;
import com.ticker.ticket_bus.repositories.ReservationRepository;
import com.ticker.ticket_bus.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.stereotype.Service;
// import java.util.List;
// 
// @Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    // public List<Reservation> getAllReservations() {
        // return reservationRepository.findAll();
    // }
}