package de.lhug.workshop.tdd.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class Step06Test {

    private Step06 sut = new Step06();

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

    // ohne Änderung durchführbar
    @Test
    public void shouldReturnFiveWhenNumberIsFive() throws Exception {
        List<Integer> result = sut.primeFactors(5);

        assertThat(result, contains(5));
    }

    // ohne Änderung durchführbar
    @Test
    public void shouldReturnTwoAndThreeWhenNumberIsSix() throws Exception {
        List<Integer> result = sut.primeFactors(6);

        assertThat(result, contains(2, 3));
    }

    // ohne Änderung durchführbar
    @Test
    public void shouldReturnSevenWhenNumberIsSeven() throws Exception {
        List<Integer> result = sut.primeFactors(7);

        assertThat(result, contains(7));
    }
}
