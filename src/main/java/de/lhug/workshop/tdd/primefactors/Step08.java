package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step08 {

    // While-Loop verdoppelt und erhöht
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        if (number > 1) {
            while (number % 2 == 0) {
                result.add(2);
                number /= 2;
            }
            while (number % 3 == 0) {
                result.add(3);
                number /= 3;
            }
        }
        if (number > 1) {
            result.add(number);
        }
        return result;
    }
}
