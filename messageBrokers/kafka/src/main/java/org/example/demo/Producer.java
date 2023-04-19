package org.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer {
    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    public void outputToInfo() {
        log.info("Какое то сообщение в логе в инфо");
    }

    public void outputToDebug() {
        log.debug("Какое то сообщение в логе в дебаг");
    }
}
