package de.lhug.workshop.tdd.primefactors;

import java.util.ArrayList;
import java.util.List;

public class Step01 {

    // Leere Liste zur�ckgeben. Da bereits bekannt ist, dass mehr kommt, ist
    // hier der Ansatz mit Collections.emptyList() unn�tig
    public List<Integer> primeFactors(int number) {
        return new ArrayList<>();
    }
}
