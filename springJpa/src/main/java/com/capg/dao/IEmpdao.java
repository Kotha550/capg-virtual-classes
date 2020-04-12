package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.dto.Employee;
import com.sun.xml.bind.v2.model.core.ID;
@Repository
public interface IEmpdao extends JpaRepository<Employee, Integer> {

}
