package com.useful.webflux.producer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service("dataProducerStringBlocked")
@Slf4j
public class DataProducerStringBlocked implements DataProducer<StringValue> {

    @Override
    public StringValue produce(long seed) {
        log.info("produce using seed:{}", seed);
        sleep();
        return new StringValue(String.format("someDataStr:%s", seed));
    }

    private void sleep() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
