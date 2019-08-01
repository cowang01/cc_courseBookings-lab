package com.codeclan.example.CourseBookings.repostitories.customers;

import com.codeclan.example.CourseBookings.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> createAListOfCustomersByCourseName(String name);

    List<Customer> createAListOfCustomersByTownAndCourse(String town, String name);
}
