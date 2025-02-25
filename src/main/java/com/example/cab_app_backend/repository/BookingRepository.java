package com.example.cab_app_backend.repository;

import com.example.cab_app_backend.Model.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface BookingRepository extends MongoRepository<Booking, String> {

    List<Booking> findByDriverid(String driverid);
    List<Booking> findByBookstatus(int bookstatus);
}
