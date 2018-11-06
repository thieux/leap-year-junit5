package com.mathieupauly.kata.leapyear;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    @Test
    void test() {
        assertThat(365.2424).isEqualTo(365.2425, Offset.offset(0.0001));
    }

}
