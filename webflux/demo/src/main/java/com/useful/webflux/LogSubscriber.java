package com.useful.webflux;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@Slf4j
public class LogSubscriber implements Subscriber<Person> {

    @Override
    public void onSubscribe(Subscription subscription) {
        log.info("Я родился");
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(Person person) {
        log.info("Что-то делаю со текущим {}-{},",
                person.getFirstName(), person.getPersonId());
    }

    @Override
    public void onError(Throwable throwable) {
        log.info("Кака-то ошибка");
    }

    @Override
    public void onComplete() {
        log.info("Поток завершился");
    }
}
