package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step05 {

    // Erste Bedingung verdoppelt -> Tests sind erfolgreich
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        if (number > 1) {
            if (number % 2 == 0) {
                result.add(2);
                number /= 2;
            }
        }
        if (number > 1) {
            result.add(number);
        }
        return result;
    }

    /**
     * Es ist deutlich, dass hier bereits refactored werden *kann*, aber es ist
     * noch nicht ganz eindeutig, was der beste Weg ist.
     */
}
