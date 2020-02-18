package com.reactspringreview.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class ConsultantController {
    private ConsultantRepository repo;

    public ConsultantController(ConsultantRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/consultants")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Consultant> jsonAll() {
        return repo.findAll().stream()
                .collect(Collectors.toList());
    }
}
