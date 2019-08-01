package com.codeclan.example.CourseBookings.controllers;


import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.repostitories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingByDate(@PathVariable String date) {
        return bookingRepository.findBookingByDate(date);
    }


}
