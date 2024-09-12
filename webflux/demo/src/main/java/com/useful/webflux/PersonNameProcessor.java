package com.useful.webflux;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Slf4j
public class PersonNameProcessor {
    private final PersonGenerator personGenerator;

    public Flux<Person> getPersonUpperCaseFlux() {
        return personGenerator.getRersonFlux()
                .doOnNext(p -> p.setFirstName(p.getFirstName().toUpperCase()));
    }
}
