package com.example.cab_app_backend.controller;

import com.example.cab_app_backend.Model.Booking;
import com.example.cab_app_backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins ="*")

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create a new booking
    @PostMapping("/create")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    // Get all bookings
    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    // Get booking by ID
    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable String id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/user/{userid}")
    public List<Booking> getBookingsByUserId(@PathVariable String userid) {
        return bookingService.getBookingsByUserId(userid);
    }

    // Get bookings by Driver ID
    @GetMapping("/driver/{driverid}")
    public List<Booking> getBookingsByDriverId(@PathVariable String driverid) {
        return bookingService.getBookingsByDriverId(driverid);
    }

    // Get bookings by Status
    @GetMapping("/status/{bookstatus}")
    public List<Booking> getBookingsByStatus(@PathVariable int bookstatus) {
        return bookingService.getBookingsByStatus(bookstatus);
    }

    @PutMapping("/update/{id}/driver")
    public Booking assignDriver(@PathVariable String id, @RequestBody Booking booking) {
        return bookingService.assignDriver(id, booking.getDriverid());
    }


    // Delete a booking
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable String id) {
        return bookingService.deleteBooking(id);
    }
}


