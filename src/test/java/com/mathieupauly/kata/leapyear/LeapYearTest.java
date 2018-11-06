package com.mathieupauly.kata.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private final LeapYear leapYear = new LeapYear();

    @Test
    void test() {
        assertThat(leapYear.isLeap(1996)).isEqualTo(true);
    }

}
