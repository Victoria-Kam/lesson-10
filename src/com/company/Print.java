package com.company;

public class Print {

    public void printFindFirstTwoBlocks(String first, String second) {
        System.out.println(first + " " + second);
    }

    public void printChangeLetters(StringBuilder strings) {
        System.out.println(strings);
    }

    public void printOnlyLetters(String[] strings, String string) {
        System.out.println(String.join("/", strings[1], strings[3]) + strings[4].replace(string.charAt(18), '/').replace(string.charAt(20), '/'));
    }

    public void printLettersWithStringBuilder(StringBuilder stringBuilder) {
        System.out.println(stringBuilder.toString().toUpperCase());
    }

    public void printCheckStringsForTruth(String[] strings, String str1, String str2, int i) {
        System.out.println("the parth of " + str1 + " is equals with " + str2 + " " + (strings[i].equals(str2)));
    }

    public void printCheckStringsForFalse(String str1, String str2) {
        System.out.println("the parth of " + str1 + " isn't equals with " + str2);
    }

    public void printChechStringYes() {
        System.out.println("yes, it is");
    }

    public void printChechStringNo() {
        System.out.println("no, it isn't");
    }

    public void printSeparator() {
        System.out.println("\nДополнительные задания\n************************************************************************************************");
    }


    public void printFindShotSubstring(String originalString, String string) {
        System.out.println("В строке \"" + originalString + "\" оследняя короткая подстрока - " + string);
    }

    public void printFindLongSubstring(String originalString, String string) {
        System.out.println("В строке \"" + originalString + "\" последняя длинная подстрока - " + string);
    }

    public void printMinimumSubstringDifferences(String originalString, StringBuilder rezult) {
        System.out.println("В строке \"" + originalString + "\" минимальное различие символов в первой подстроке - " + rezult);
    }
}
