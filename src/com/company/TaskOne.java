package com.company;

public class TaskOne {
    private static Print print = new Print();

    public static void findFirstTwoBlocks(String string) {          // Вывести на экран в одну строку два первых блока по 4 цифры.

        String[] strings = string.split("-");
        print.printFindFirstTwoBlocks(strings);
    }

    public static void changeLetters(String string) {           // Вывести на экран номер документа, но блоки из трех букв заменить
                                                                // на *** (каждая буква заменятся на *).
        String[] strings = string.split("-");
        print.printChangeLetters(strings);
    }

    public static void onlyLetters(String string) {
        String[] strings = string.split("-");
        print.printOnlyLetters(strings,string);
    }

    public static void lettersWithStringBuilder(StringBuilder stringBuilder, String string) {
        String[] strings = string.split("-");
        stringBuilder = new StringBuilder("Letters:");
        strings[4].replace("5", "/");
        stringBuilder.append(strings[1] + "/" + strings[3] + strings[4].replace(string.charAt(18), '/').replace(string.charAt(20),'/'));
        print.printLettersWithStringBuilder(stringBuilder);
    }

    public static void checkStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean isEquals = false;

        String[] strings = str1.split("-");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(str2)) {
                print.printCheckStringsForTruth(strings,str1,str2,i);
                isEquals = true;
            }
        }
        if (!isEquals) {
           print.printCheckStringsForFalse(str1,str2);
        }
    }

    public static void chechStartString(String str){
        if(str.startsWith("555")){
            print.printChechStringYes();
        }else {
            print.printChechStringNo();
        }
    }

    public static void chechEndString(String str){
        if(str.endsWith("1a2b")){
            print.printChechStringYes();
        }else {
            print.printChechStringNo();
        }
    }
}
