package com.useful.webflux.controller;

import com.useful.webflux.StringValue;
import com.useful.webflux.processor.DataProcessor;
import com.useful.webflux.processor.DataProcessorIntegerReactorFlux;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ProcessorDataController {

    private final DataProcessor<Flux<StringValue>> dataProcessorStringReactorFlux;
    private final DataProcessorIntegerReactorFlux dataProcessorIntegerReactorFlux;
    private final DataProcessor<Mono<StringValue>> dataProcessorStringReactorMono;
    private final WebClient client;

    public ProcessorDataController(WebClient.Builder builder,
                                   @Qualifier("dataProcessorFlux") DataProcessor<Flux<StringValue>> dataProcessorFlux,
                                   @Qualifier("dataProcessorIntegerFlux") DataProcessorIntegerReactorFlux dataProcessorIntegerReactorFlux,
                                   @Qualifier("dataProcessorMono") DataProcessor<Mono<StringValue>> dataProcessorMono) {
        this.dataProcessorStringReactorFlux = dataProcessorFlux;
        this.dataProcessorStringReactorMono = dataProcessorMono;
        this.dataProcessorIntegerReactorFlux = dataProcessorIntegerReactorFlux;
        client = builder
                .baseUrl("http://localhost:8080")
                .build();
    }

    @GetMapping(value = "/data/int", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Integer> getDataInt() {

        return dataProcessorIntegerReactorFlux.process().doOnNext(t -> log.info("integerrr: {}", t));
    }

    @GetMapping(value = "/data/{seed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<StringValue> data(@PathVariable("seed") long seed) {
        log.info("request for data, seed:{}", seed);

        var srcRequest = client.get().uri(String.format("/data/%d", seed))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(StringValue.class);
        return dataProcessorStringReactorFlux.process(srcRequest);
    }

    @GetMapping(value = "/data-mono/{seed}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<StringValue> dataMono(@PathVariable("seed") long seed) {
        log.info("request for string data-mono, seed:{}", seed);

        var srcRequest = client.get().uri(String.format("/data-mono/%d", seed))
                .retrieve()
                .bodyToMono(StringValue.class);

        return dataProcessorStringReactorMono.process(srcRequest);
    }
}
