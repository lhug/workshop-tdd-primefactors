package de.lhug.workshop.tdd.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Step04Test {

    private Step04 sut = new Step04();

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

    @Test
    public void shouldReturnThreeWhenNumberIsThree() throws Exception {
        List<Integer> result = sut.primeFactors(3);

        assertThat(result, contains(3));
    }

    @Test
    public void shouldReturnTwoAndTwoWhenNumberIsFour() throws Exception {
        List<Integer> result = sut.primeFactors(4);

        assertThat(result, contains(2, 2));
    }
}
