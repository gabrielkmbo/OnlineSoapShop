package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseJpaRepository extends JpaRepository <Course, Long>
{
    public List<Course> findByName(String name);



}
