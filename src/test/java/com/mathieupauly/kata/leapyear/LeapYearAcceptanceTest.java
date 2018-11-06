package com.mathieupauly.kata.leapyear;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearAcceptanceTest {

    private static final int ERA_IN_YEARS = 10_000;
    private static final double GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS = 365.2425;
    private final LeapYear leapYear = new LeapYear();

    @Test
    void delta_between_earth_revolution_and_basic_calendar_should_be_small() {
        double eraInDays = 0;
        for (int year = 0; year < ERA_IN_YEARS; year++) {
            eraInDays += leapYear.isLeap(year) ? 366 : 365;
        }
        assertThat(eraInDays).isEqualTo(GREGORIAN_AVERAGE_YEAR_LENGTH_IN_DAYS * ERA_IN_YEARS,
                Offset.offset(0.0001));
    }

    @Test
    void should_match_jdk_builtin_algorithm() {
        Map<Integer, Boolean> expected = new HashMap<>();
        Map<Integer, Boolean> actual = new HashMap<>();

        for (int year = 0; year < ERA_IN_YEARS; year++) {
            expected.put(year, Year.isLeap(year));

            boolean leap = leapYear.isLeap(year);
            actual.put(year, leap);
        }
        assertThat(actual).isEqualTo(expected);

    }


}
