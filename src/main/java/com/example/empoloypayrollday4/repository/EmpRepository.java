package com.example.empoloypayrollday4.repository;

import com.example.empoloypayrollday4.empmodel.EmpModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<EmpModel, Integer> {
}
