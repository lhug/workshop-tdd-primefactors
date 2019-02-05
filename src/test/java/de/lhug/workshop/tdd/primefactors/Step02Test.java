package de.lhug.workshop.tdd.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Step02Test {

    private Step02 sut = new Step02();

    @Test
    public void shouldReturnEmptyListWhenNumberIsOne() throws Exception {
        List<Integer> result = sut.primeFactors(1);

        assertThat(result, is(empty()));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo() throws Exception {
        List<Integer> result = sut.primeFactors(2);

        assertThat(result, contains(2));
    }
}
