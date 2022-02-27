package com.xtravel.reactor;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReactorTest {
    public static void main(String[] args) {
        //just 方法直接声明
        Flux<Integer> just = Flux.just(1, 2);
        just.subscribe((val) -> {
            System.out.println(val);
        });

        Mono<Integer> just1 = Mono.just(1);

        //其他的方法
        Integer[] array = {1, 2, 3, 4};
        Flux<Integer> integerFlux = Flux.fromArray(array);
        integerFlux.subscribe((val) -> {
            System.out.println(val);
        });

        List<Integer> list = Arrays.asList(array);
        Flux<Integer> integerFlux1 = Flux.fromIterable(list);
        integerFlux1.subscribe((val) -> {
            System.out.println(val);
        });

        Stream<Integer> stream = list.stream();
        Flux<Integer> integerFlux2 = Flux.fromStream(stream);
        integerFlux2.subscribe((val) -> {
            System.out.println(val);
        });
    }
}
