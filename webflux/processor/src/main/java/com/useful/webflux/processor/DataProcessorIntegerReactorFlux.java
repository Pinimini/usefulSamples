package com.useful.webflux.processor;

import com.useful.webflux.StringValue;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;

import java.time.Duration;

@Service("dataProcessorIntegerFlux")
@Slf4j
public class DataProcessorIntegerReactorFlux {
    private final Scheduler timer;
    private final WebClient client;

    public DataProcessorIntegerReactorFlux(Scheduler timer) {
        this.timer = timer;
        client = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .build();
    }

    public Flux<Integer> process() {
        log.info("processor");
        var dataSeq = client.get().uri("/data/int")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Integer.class);

        log.info("processor method finished");
        return dataSeq;
    }
}
