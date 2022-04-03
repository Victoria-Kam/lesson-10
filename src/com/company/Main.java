package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "5555-ccc-5555-ccc-1a3b-abc";
        String string1 = "abc";
        StringBuilder stringBuilder = null;
        System.out.println(string);

        TaskOne.findFirstTwoBlocks(string);
        TaskOne.changeLetters(string);
        TaskOne.onlyLetters(string);
        TaskOne.lettersWithStringBuilder(stringBuilder,string);
        TaskOne.checkStrings(string,string1);
        TaskOne.chechStartString(string);
        TaskOne.chechEndString(string);

    }
}
