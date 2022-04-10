package com.company;

//"5555-ccc-5555-ccc-1a3b-abc"

public class TaskOne {
    private static Print print = new Print();

    public static void findFirstTwoBlocks(String string) {          // Вывести на экран в одну строку два первых блока по 4 цифры.

        string = string.toLowerCase();;
        String first = string.substring(0,4);
        String second = string.substring(9,13);
        print.printFindFirstTwoBlocks(first,second);
    }

    public static void changeLetters(String string) {           // Вывести на экран номер документа, но блоки из трех букв заменить
                                                                // на *** (каждая буква заменятся на *).
        string = string.toLowerCase();
       // String strings = string.;
        //print.printChangeLetters(strings);
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(5,7,"*");
        stringBuilder.replace(6,7,"*");
        stringBuilder.replace(7,7,"*");
        stringBuilder.replace(14,16,"*");
        stringBuilder.replace(15,16,"*");
        stringBuilder.replace(16,16,"*");
        print.printChangeLetters(stringBuilder);
    }

    public static void onlyLetters(String string) {
        string = string.toLowerCase();
        String[] strings = string.split("-");
        print.printOnlyLetters(strings,string);
    }

    public static void lettersWithStringBuilder(String string) {
        string = string.toLowerCase();
        String[] strings = string.split("-");
        StringBuilder stringBuilder = new StringBuilder("Letters:");
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
        str = str.toLowerCase();
        if(str.startsWith("555")){
            print.printChechStringYes();
        }else {
            print.printChechStringNo();
        }
    }

    public static void chechEndString(String str){
        str = str.toLowerCase();
        if(str.endsWith("1a2b")){
            print.printChechStringYes();
        }else {
            print.printChechStringNo();
        }
    }
}
