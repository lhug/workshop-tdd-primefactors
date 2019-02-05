package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step02 {

    // In Variable gespeichert
    // Sonderfall für "2" zugefügt
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        if (number == 2) {
            result.add(2);
        }
        return result;
    }
}
