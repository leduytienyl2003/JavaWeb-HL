package com.K21CNT.LDT.Lesson09.repository;

import com.K21CNT.LDT.Lesson09.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
