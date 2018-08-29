package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrimeFactorsExercises {

    public void generate(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2) {
            return;
        }
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    primes.add(i);
                    n /= i;
                    break;
                }
            }
        }
        primes = primes.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(primes);
    }
}
