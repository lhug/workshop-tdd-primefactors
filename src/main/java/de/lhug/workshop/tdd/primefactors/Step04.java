package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step04 {

    // Weitere Bedingung zugef�gt -> Test 2 Schl�gt fehl
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
     * Begr�ndung: Wenn 2 Eingegeben wird ist die Zahl gr��er als 1. 2 ist
     * Teilbar durch 2, also wird 2 halbiert. Dies l�sst eine 1 �brig, die aber
     * nicht zugef�gt werden darf.
     */
}
