package com.company.Task10;

import com.company.Print;

public class AdditionalTask {

    private static Print print = new Print();

    public static void findShotSubstring(String string) {

        string = string.replaceAll("\\s+", " ").trim();     // лишние пробелы заменяем одним
        String[] strings = string.split(" ");

        String shot = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (shot.length() > strings[i].length()) {
                shot = strings[i];
            } else if (shot.length() == strings[i].length()) {
                shot = strings[i];
            }
        }
        print.printFindShotSubstring(string, shot);
    }

    public static void findLongSubstring(String string) {
        string = string.replaceAll("\\s+", " ").trim();     // лишние пробелы заменяем одним
        String[] strings = string.split(" ");

        String longString = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (longString.length() < strings[i].length()) {
                longString = strings[i];
            } else if (longString.length() == strings[i].length()) {
                longString = strings[i];
            }
        }
        print.printFindLongSubstring(string, longString);
    }


    public static void minimumSubstringDifferences(String string) {

        string = string.replaceAll("\\s+", " ").trim();
        String[] strings = string.split(" ");
        String minSymOfString = strings[0];

        for(int i = 1; i < strings.length; i++){

            if(findMinimumSubstring(minSymOfString) > findMinimumSubstring(strings[i])){
                minSymOfString = strings[i];
                break;
            }
        }

        System.out.println(minSymOfString);
    }

    public static Print getPrint() {
        return print;
    }

    private static int findMinimumSubstring(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        String[] strings = str.split("");
        String temp;

        for (int i = 0; i < strings.length; i++) {
            temp = strings[i];
            if (stringBuilder.indexOf(temp) == -1) {
                stringBuilder.append(temp);
            }
        }
        return stringBuilder.length();
    }

}
