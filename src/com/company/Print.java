package com.company;

public class Print {

    public void printFindFirstTwoBlocks(String[] strings) {
        System.out.println(strings[0] + "\t" + strings[2]);
    }

    public void printChangeLetters(String[] strings) {
        System.out.println(strings[1].replace('c', '*') + "\t" + strings[3].replace('c', '*'));
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

    public void printChechStringYes(){
        System.out.println("yes, it is");
    }

    public void printChechStringNo(){
        System.out.println("no, it isn't");
    }
}
