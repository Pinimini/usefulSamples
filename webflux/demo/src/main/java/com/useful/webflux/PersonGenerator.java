package com.useful.webflux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.function.BiFunction;

public class PersonGenerator {

    private final Scheduler timer = Schedulers.newParallel("processor-thread", 2);
    ;

    public Flux<Person> getRersonFlux() {
        return Flux.generate(() -> 1,
                        (BiFunction<Integer, SynchronousSink<Person>, Integer>)
                                (state, sink) -> {
                                    sink.next(Person.builder().personId(state).age(15).firstName("Oleg").build());
                                    return state + 1;
                                })
                .take(6)
                .delayElements(Duration.ofSeconds(1), timer);
    }
}
