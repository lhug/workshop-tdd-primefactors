package de.lhug.workshop.tdd.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Step01Test {

    private Step01 sut = new Step01();

    @Test
    public void shouldReturnEmptyListWhenNumberIsOne() throws Exception {
        List<Integer> result = sut.primeFactors(1);

        assertThat(result, is(empty()));
    }
}
