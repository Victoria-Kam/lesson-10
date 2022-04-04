package com.company;

public class AdditionalTask {

    private static Print print = new Print();

    public static void findShotSubstring(String string) {

        string = string.replaceAll("\\s+", " ").trim();     // лишние пробелы заменяем одним
        String[] strings = string.split(" ");

        String temp;
        String shot = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (shot.length() > strings[i].length()) {
                temp = strings[i];
                strings[i] = shot;
                shot = temp;
            }
            if (shot.length() == strings[i].length()) {
                shot = strings[i];
            }
        }
        print.printFindShotSubstring(string, shot);
    }

    public static void findLongSubstring(String string) {
        string = string.replaceAll("\\s+", " ").trim();     // лишние пробелы заменяем одним
        String[] strings = string.split(" ");

        String temp;
        String longString = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (longString.length() < strings[i].length()) {
                temp = strings[i];
                strings[i] = longString;
                longString = temp;
            }
            if (longString.length() == strings[i].length()) {
                longString = strings[i];
            }
        }
        print.printFindLongSubstring(string, longString);
    }


    public static void minimumSubstringDifferences(String string) {
        string = string.replaceAll("\\s+", " ").trim();     // лишние пробелы заменяем одним
        String[] str = string.split(" ");
        String[][] strings = new String[str.length][];
        for (int i = 0; i < str.length; i++) {
            strings[i] = str[i].split("");
        }

        String min;
        StringBuilder rezult = new StringBuilder();
        boolean isFinded = false;

        for (int i = 0; i < strings.length; i++) {
            min = strings[i][0];                                // начальный элемент для поиска в строке
            if (!isFinded) {
                for (int j = 0; j < strings[i].length; j++) {
                    // System.out.print(strings[i][j]);
                    if (min.equals(strings[i][j])) {
                        rezult.append(strings[i][j]);
                        min = strings[i][j];
                    }
                }
                isFinded = true;
            }
            break;
        }

        print.printMinimumSubstringDifferences(string, rezult);

    }

    public static Print getPrint() {
        return print;
    }
}
