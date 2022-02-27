package com.xtravel.flow;

import java.util.concurrent.Flow;

public class FlowTest {
    public static void main(String[] args) {
        test1();
        //PublisherTest<String> publisherTest = new PublisherTest<>();
        //SubscriberTest<Object> subscriber = new SubscriberTest<>();
        //publisherTest.subscribe(subscriber);
        //subscriber.onNext("1");
        //subscriber.onNext("2");
        //subscriber.onError(new RuntimeException("出错"));
        //subscriber.onComplete();
    }

    private static void test1() {
        Flow.Publisher<String> publisher = subscriber -> {
            subscriber.onNext("1");
            subscriber.onNext("2");
            subscriber.onError(new RuntimeException("出错"));
            subscriber.onComplete();
        };

        publisher.subscribe(new Flow.Subscriber<>() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                subscription.cancel();
                System.out.println("Subscribe");
            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Complete");
            }
        });
    }

    public static class PublisherTest<T> implements Flow.Publisher<T>{
        @Override
        public void subscribe(Flow.Subscriber<? super T> subscriber) {

        }
    }

    public static class SubscriberTest<T> implements Flow.Subscriber<T>{
        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            subscription.cancel();
        }

        @Override
        public void onNext(T item) {
            System.out.println(item);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println(throwable.getMessage());
        }

        @Override
        public void onComplete() {
            System.out.println("Complete");
        }
    }
}
