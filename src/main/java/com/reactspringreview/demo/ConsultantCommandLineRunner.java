package com.reactspringreview.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ConsultantCommandLineRunner implements CommandLineRunner {

    private final ConsultantRepository repo;

    public ConsultantCommandLineRunner(ConsultantRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Abby Dudra"	,
                "Alex Giles"	,
                "Asad Nawaz"	,
                "Darren Gomez"	,
                "Drake Sands"	,
                "Harrison Ngo"	,
                "Maodo Sow"	,
                "Kurtis Bassman"	,
                "Jared Hilliard"	,
                "Jean-Pierre  Salazar Lobo"	,
                "Jesse Cohen"	,
                "John Caley"	,
                "Joseph "	,
                "Joshua Araujo"	,
                "Kenny Yang"	,
                "Pooya Motee"	,
                "Roger Lester Palabasan"	,
                "Siddarth Thakkar"	,
                "Tyler Peterson"	,
                "Zach Hammons"
        ).forEach(n -> repo.save(new Consultant(n)));

        repo.findAll().forEach(System.out::println);
    }
}
