package ru.clevertec;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int zero = 0;
        int number = Integer.parseInt(str);
        return NumberUtils.compare(number, zero) > zero;
    }
}
