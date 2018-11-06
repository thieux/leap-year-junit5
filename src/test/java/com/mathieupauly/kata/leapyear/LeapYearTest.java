package com.mathieupauly.kata.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @CsvSource({"1996, true"})
    void yearShouldBeLeapWhenDivisibleBy4(int year, boolean shouldBeLeap) {
        assertThat(leapYear.isLeap(year)).as("yearShouldBeLeapWhenDivisibleBy4").isEqualTo(shouldBeLeap);
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
