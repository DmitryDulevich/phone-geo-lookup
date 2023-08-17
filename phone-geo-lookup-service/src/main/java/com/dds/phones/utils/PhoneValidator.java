package com.dds.phones.utils;

import com.dds.phones.exception.PhoneValidationException;

import java.util.regex.Pattern;

public class PhoneValidator {
    public static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$");

    public static void validatePhoneNumber(final String phone) {
        if (!PHONE_NUMBER_PATTERN.matcher(phone).matches()) {
            throw new PhoneValidationException("Invalid phone number");
        }
    }
}
