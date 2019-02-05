package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step10 {

    // divisor-int eingeführt
    // Erhöhung nach Schleifendurchlauf
    // erstes "if" gegen "while" getauscht
    // letztes "if" entfernt
    public List<Integer> primeFactors(int number) {
        List<Integer> result = new ArrayList<>();
        int divisor = 2;
        while (number > 1) {
            while (number % divisor == 0) {
                result.add(divisor);
                number /= divisor;
            }
            divisor++;
        }
        return result;
    }

    /**
     * Ab jetzt ist das Refactoring einfach erkennbar:
     */
}
