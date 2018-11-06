package com.mathieupauly.kata.leapyear;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private static final int ERA_IN_YEARS = 10_000;
    private static final double GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS = 365.2425;

    @Test
    void delta_between_earth_revolution_and_basic_calendar_should_be_small() {
        double eraInDays = 0;
        for (int year = 0; year < ERA_IN_YEARS; year++) {
            eraInDays += isLeap(year) ? 366 : 365;
        }
        assertThat(eraInDays).isEqualTo(GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS * ERA_IN_YEARS,
                Offset.offset(0.0001));
    }

    private boolean isLeap(int year) {
        return false;
    }

}
