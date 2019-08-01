package com.codeclan.example.CourseBookings.controllers;


import com.codeclan.example.CourseBookings.models.Customer;
import com.codeclan.example.CourseBookings.repostitories.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{name}")
    public List<Customer> findCustomerByCourse(@PathVariable String name) {
        return customerRepository.createAListOfCustomersByCourseName(name);
    }

    @GetMapping(value = "/town/{town}/name/{name}")
    public List<Customer> findCustomersFromATownByACourse(@PathVariable String town, @PathVariable String name){
        return customerRepository.createAListOfCustomersByTownAndCourse(town , name);
    }


}
