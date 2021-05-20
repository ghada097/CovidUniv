package com.example.covidms.controllers;

import com.example.covidms.models.TestPCR;
import com.example.covidms.repository.TestPCRRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TestPCRController {
    @Autowired
    private TestPCRRep repository;

    @PostMapping(value = "/TestPCR/create")
    public TestPCR postTestPCR(@RequestBody TestPCR testpcr) {

        TestPCR test = repository.save(new TestPCR(testpcr.getName(),testpcr.getEmail(), testpcr.getPhone()));
        return test;
    }

    @GetMapping(path="/TestPCR")
    public @ResponseBody
    Iterable<TestPCR> getAllTests() {
        return repository.findAll();
    }

}
