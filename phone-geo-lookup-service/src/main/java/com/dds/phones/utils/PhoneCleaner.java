package com.dds.phones.utils;

import static com.dds.phones.utils.Constants.EMPTY_STRING;

public class PhoneCleaner {

    public static String cleanPhoneNumber(final String phone){
        return phone
                .replaceAll("\\+", EMPTY_STRING)
                .replaceAll("\\(", EMPTY_STRING)
                .replaceAll("\\)", EMPTY_STRING)
                .replaceAll("\\.", EMPTY_STRING)
                .replaceAll("-", EMPTY_STRING)
                .replaceAll(" ", EMPTY_STRING);
    }
}
