package com.mathieupauly.kata.leapyear;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    private static final int ERA_IN_YEARS = 10_000;
    private static final double GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS = 365.2425;

    @Test
    void delta_between_earth_revolution_and_basic_calendar_should_be_small() {
        double eraInDays;
        eraInDays = 365 * ERA_IN_YEARS;
        assertThat(eraInDays).isEqualTo(GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS * ERA_IN_YEARS,
                Offset.offset(0.0001));
    }

}
