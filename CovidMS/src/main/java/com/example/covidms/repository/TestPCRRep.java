package com.example.covidms.repository;

import com.example.covidms.models.TestPCR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestPCRRep extends JpaRepository<TestPCR, Integer> {
}
