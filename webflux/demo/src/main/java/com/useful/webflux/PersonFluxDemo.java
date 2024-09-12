package com.useful.webflux;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscriber;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
public class PersonFluxDemo {

    private final PersonNameProcessor personNameProcessor = new PersonNameProcessor(new PersonGenerator());

    public static void main(String[] args) {
        Subscriber<Person> logSubscriber = new LogSubscriber();

        Flux<Person> streamPersons = new PersonFluxDemo().start();

        //streamPersons.take(5).subscribe(logSubscriber);
        streamPersons.take(5).subscribe();
        List<Person> person = streamPersons.collectList().block();

        log.info("list: {}", person);
        //log.info("blockFirst: {}, {}", person.getFirstName() , person.getPersonId());
/*        streamPersons.take(9).subscribe(fp ->
                log.info("log from subscriber: {}", fp.getFirstName())
        );*/
/*        try {
            Thread.sleep(10000); // 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    private Flux<Person> start() {
        return personNameProcessor.getPersonUpperCaseFlux();
    }
}