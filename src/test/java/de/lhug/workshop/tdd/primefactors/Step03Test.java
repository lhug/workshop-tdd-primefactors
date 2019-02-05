package de.lhug.workshop.tdd.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Step03Test {

    private Step03 sut = new Step03();

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
}
