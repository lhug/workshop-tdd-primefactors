package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step12 {

    // inneres while gegen for getauscht
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        for (int divisor = 2; number > 1; divisor++) {
            for (; number % divisor == 0; number /= divisor) {
                result.add(divisor);
            }
        }
        return result;
    }

    /**
     * Refactoring beendet
     */
}
