package com.company.Task10;

import java.util.Arrays;

public class TaskFour {

    private String[] strings;
    private int position;
    private StringBuilder stringBuilder;

    public int returnSizeString(String string) {

        string = string.trim();

        String str = string.replace(",", "").replace(":", "").replace(
                ".", "").replace(" ", "-");
        str = str.toLowerCase();

        strings = str.split("-");

        return strings.length;
    }

    public String word(int substringNumber) {
        position = substringNumber - 1;
        return strings[position];
    }

    public boolean isPalindrome() {
        stringBuilder = new StringBuilder(strings[position]);

        String str = strings[position];

        boolean isEquals = str.equals(stringBuilder.reverse().toString());

        return isEquals;
    }
}
