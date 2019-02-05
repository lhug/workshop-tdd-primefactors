package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step01 {

    // Leere Liste zurückgeben. Da bereits bekannt ist, dass mehr kommt, ist
    // hier der Ansatz mit Collections.emptyList() unnötig
    public List<Integer> primeFactors(int number) {
        return new ArrayList<>();
    }
}
