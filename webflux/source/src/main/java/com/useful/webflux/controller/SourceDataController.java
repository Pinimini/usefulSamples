package com.useful.webflux.controller;


import com.useful.webflux.producer.DataProducer;
import com.useful.webflux.producer.IntegerGeneratorReactorFlux;
import com.useful.webflux.producer.StringValue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SourceDataController {

    private final DataProducer<Flux<StringValue>> dataProducerFlux;
    private final DataProducer<StringValue> dataProducerStringBlocked;
    private final IntegerGeneratorReactorFlux integerGeneratorReactorFlux;

    private final ExecutorService executor = Executors.newFixedThreadPool(4);

    @GetMapping(value = "/data/int", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Integer> getDataInt() {
        return integerGeneratorReactorFlux.produce();
    }

    @GetMapping(value = "/data/{seed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<StringValue> data(@PathVariable("seed") long seed) {
        log.info("request for string data, seed:{}", seed);
        var stringData = dataProducerFlux.produce(seed);

        log.info("Method request for string data done");
        return stringData;
    }

    @GetMapping(value = "/data-mono/{seed}", produces = "application/json")
    public StringValue dataMono(@PathVariable("seed") long seed) {
        log.info("request for string data-mono, seed:{}", seed);
        log.info("Method request for string data done");

/*        var future = CompletableFuture
                .supplyAsync(() -> dataProducerStringBlocked.produce(seed), executor); */
        var future = CompletableFuture
                .supplyAsync(() -> dataProducerStringBlocked.produce(seed), executor);
        //return Mono.fromFuture(future);
        return dataProducerStringBlocked.produce(seed);
    }
}
