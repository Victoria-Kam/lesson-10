package com.company;

import com.company.Task11.Exceptions.ExistException;
import com.company.Task11.Exceptions.FirstSubException;
import com.company.Task11.Exceptions.LastSubException;
import com.company.Task10.AdditionalTask;
import com.company.Task10.TaskFive;
import com.company.Task10.TaskFour;
import com.company.Task10.TaskOne;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        String string = "5555-ccc-5555-abc-ccc-1a2b";
        String string1 = "abc";
        System.out.println(string);

        try {
            TaskOne.findFirstTwoBlocks(string);
        } catch (FirstSubException e) {
            e.printStackTrace();
            System.out.println(e);
        }

        try {
            TaskOne.findLastSubstring(string);
        }catch (LastSubException e){
            e.printStackTrace();
            System.out.println(e);
        }

        try {
            TaskOne.isThereASubstring(string);
        }catch (ExistException e){
            e.printStackTrace();
            System.out.println(e);
        }
        TaskOne.changeLetters(string);
        TaskOne.onlyLetters(string);
        TaskOne.lettersWithStringBuilder(string);
        TaskOne.checkStrings(string, string1);
        TaskOne.chechStartString(string);
        TaskOne.chechEndString(string);

        AdditionalTask.getPrint().printSeparator();

        String str = "        fhj 67 2  3  fggh rgrgh    aaaaaaa bbbbbbb fgrt ";
        AdditionalTask.findShotSubstring(str);
        AdditionalTask.findLongSubstring(str);
        AdditionalTask.minimumSubstringDifferences("fffff ab f 1234 jkjk");

        Scanner scan = new Scanner(System.in);
        int substringNumber=0;
        boolean isCheked = false;
        TaskFour taskFour = new TaskFour();


        AdditionalTask.getPrint().printSeparator();

        System.out.print("Введи предложение: ");
        String strLine = scan.nextLine();


        while (!isCheked) {
            System.out.print("Введи номер слова в предложении, которое чохешь проверить на палиндромность:");
            while (!scan.hasNextInt()) {
                System.out.println("Нужно ввести целочисленное число. Введи еще раз.");
                scan.nextLine();
            }
            substringNumber = scan.nextInt();
            if (substringNumber <= taskFour.returnSizeString(strLine) && substringNumber != 0) {
                isCheked = true;
            } else {
                System.out.println("Введенное число больше, чем слов в предложении. Введи еще раз.");
            }
        }

        System.out.println("Слово \'" + taskFour.word(substringNumber) + "\' является палиндромом? Ответ: " + taskFour.isPalindrome());

        StringBuilder  stringBuilder = new StringBuilder();

        stringBuilder = TaskFive.dublicateLetters("Hello");

        System.out.println(stringBuilder);
    }
}
