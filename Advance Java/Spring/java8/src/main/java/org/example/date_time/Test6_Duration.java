package org.example.date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test6_Duration {
    public static void main(String[] args) {
        Instant start = Instant.now();
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i + 1;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);
    }
}
