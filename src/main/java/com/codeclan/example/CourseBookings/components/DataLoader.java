package com.codeclan.example.CourseBookings.components;


import com.codeclan.example.CourseBookings.models.Booking;
import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repostitories.BookingRepository;
import com.codeclan.example.CourseBookings.repostitories.courses.CourseRepository;
import com.codeclan.example.CourseBookings.repostitories.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRespostiory;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Course course_1 = new Course("Software Development", "Glasgow", 5);
        courseRespostiory.save(course_1);

        Course course_2 = new Course("CSS", "Glasgow", 5);
        courseRespostiory.save(course_2);

        Course course_3 = new Course("HTML", "Edinburgh", 5);
        courseRespostiory.save(course_3);


        Customer customer_1 = new Customer("John Smith", "Glasgow", 30);
        customerRepository.save(customer_1);

        Customer customer_2 = new Customer("Mary Smith", "Glasgow", 32);
        customerRepository.save(customer_2);

        Customer customer_3 = new Customer("Colin Davidson", "Edinburgh", 25);
        customerRepository.save(customer_3);


        Booking booking_1 = new Booking("26-08-19", course_1, customer_1);
        bookingRepository.save(booking_1);

        Booking booking_2 = new Booking("26-08-19", course_1, customer_2);
        bookingRepository.save(booking_2);

        Booking booking_3 = new Booking("26-08-19", course_3, customer_2);
        bookingRepository.save(booking_3);


    }
}
