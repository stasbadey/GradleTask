package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("1"));
    }
}
