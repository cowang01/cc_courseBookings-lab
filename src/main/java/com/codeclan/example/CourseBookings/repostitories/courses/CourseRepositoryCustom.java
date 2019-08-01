package com.codeclan.example.CourseBookings.repostitories.courses;

import com.codeclan.example.CourseBookings.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesByCustomer(String name);
}
