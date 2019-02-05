package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step11 {

    // ‰uﬂeres while gegen for getauscht
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        for (int divisor = 2; number > 1; divisor++) {
            while (number % divisor == 0) {
                result.add(divisor);
                number /= divisor;
            }
        }
        return result;
    }
}
