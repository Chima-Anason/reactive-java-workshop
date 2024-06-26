package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Mono;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        Mono<Integer> mono = ReactiveSources.intNumberMono();
        System.out.println(mono);


        System.out.println("Press a key to end");
        System.in.read();
    }

}
