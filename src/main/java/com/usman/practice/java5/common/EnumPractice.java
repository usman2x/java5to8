package com.usman.practice.java5.common;

import com.usman.practice.constants.Days;
import com.usman.practice.constants.DaysConstant;
import com.usman.practice.constants.Gender;

public class EnumPractice {
    public static void main(String[] args) {
        //Enums are by default constant and static.
        Days day = Days.FRIDAY;
        //But you can't assign other type of enum to Days.
        //Gender gender = Days.MONDAY; this will give compile time error.

        String gender = DaysConstant.MONDAY; // it logically wrong.
    }
}
