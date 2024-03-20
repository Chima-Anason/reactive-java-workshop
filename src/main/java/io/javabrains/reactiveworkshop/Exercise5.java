package io.javabrains.reactiveworkshop;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberFlux() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
        // TODO: Write code here
//        ReactiveSources.intNumbersFlux()
//                .subscribe(e -> System.out.println(e),
//                        err -> System.out.println(err.getMessage()),
//                        () -> System.out.println("Complete"));

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(new MySubscribers<>());

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscribers<T> extends BaseSubscriber<T> {
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribe happened.");
        request(1);
    }

    public void hookOnNext(T value) {
        System.out.println(value.toString() + " received");
        request(1);
    }

}