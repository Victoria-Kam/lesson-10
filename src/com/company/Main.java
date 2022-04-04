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
        TaskOne.lettersWithStringBuilder(stringBuilder, string);
        TaskOne.checkStrings(string, string1);
        TaskOne.chechStartString(string);
        TaskOne.chechEndString(string);

        AdditionalTask.getPrint().printSeparator();

        String str = "        fhj 67 2  3  fggh rgrgh    aaaaaaa bbbbbbb fgrt ";
        AdditionalTask.findShotSubstring(str);
        AdditionalTask.findLongSubstring(str);
        AdditionalTask.minimumSubstringDifferences("333 fffff ab f 1234 jkjk");
    }
}
