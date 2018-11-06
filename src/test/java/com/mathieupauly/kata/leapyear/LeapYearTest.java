package com.mathieupauly.kata.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1996})
    void yearShouldBeLeapWhenDivisibleBy4(int year) {
        assertThat(leapYear.isLeap(year)).isEqualTo(true);
    }

    @Test
    void yearShouldBeCommonWhenNotDivisibleBy4() {
        assertThat(leapYear.isLeap(2001)).isEqualTo(false);
    }

    @Test
    void yearShouldBeAtypicallyCommonWhenDivisibleBy100() {
        assertThat(leapYear.isLeap(1900)).isEqualTo(false);
    }

}
