package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step04 {

    // Weitere Bedingung zugefügt -> Test 2 Schlägt fehl
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        if (number > 1) {
            if (number % 2 == 0) {
                result.add(2);
                number /= 2;
            }
            result.add(number);
        }
        return result;
    }

    /**
     * Begründung: Wenn 2 Eingegeben wird ist die Zahl größer als 1. 2 ist
     * Teilbar durch 2, also wird 2 halbiert. Dies lässt eine 1 übrig, die aber
     * nicht zugefügt werden darf.
     */
}
