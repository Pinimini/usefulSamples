package com.useful.webflux.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;

import java.time.Duration;

@Service("integerGeneratorFlux")
@Slf4j
public class IntegerGeneratorReactorFlux {
    private final Scheduler timer;

    public IntegerGeneratorReactorFlux(Scheduler timer) {
        this.timer = timer;
    }

    public Flux<Integer> produce() {

        return Flux.range(1, 10)
                .map(i -> i * 2)
                .delayElements(Duration.ofSeconds(3), timer);
    }
}
