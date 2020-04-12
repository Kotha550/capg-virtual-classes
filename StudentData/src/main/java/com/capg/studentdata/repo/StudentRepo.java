package com.capg.studentdata.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.studentdata.model.StudentDetails;
@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Integer> {

}
