package com.codeclan.example.CourseBookings.repostitories.customers;

import com.codeclan.example.CourseBookings.models.Course;
import com.codeclan.example.CourseBookings.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {


}
