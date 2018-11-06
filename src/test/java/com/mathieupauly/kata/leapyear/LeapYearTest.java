package com.mathieupauly.kata.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @CsvSource({"1996, true, yearShouldBeLeapWhenDivisibleBy4", "2001, false, yearShouldBeCommonWhenNotDivisibleBy4",
            "1900, false, yearShouldBeAtypicallyCommonWhenDivisibleBy100", "2000, true, yearShouldBeAtypicallyLeapWhenDivisibleBy400"})
    void test(int year, boolean shouldBeLeap, String description) {
        assertThat(leapYear.isLeap(year)).as(description).isEqualTo(shouldBeLeap);
    }

}
