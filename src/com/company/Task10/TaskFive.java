package com.company.Task10;

public class TaskFive {

    public static StringBuilder dublicateLetters(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] strings = str.toCharArray();

        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
            stringBuilder.append(strings[i]);
        }

        return stringBuilder;
    }
}
