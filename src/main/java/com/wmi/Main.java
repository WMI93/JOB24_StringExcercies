package com.wmi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int choix;
    static Scanner sc = new Scanner(System.in);
    private static void sop(Object o) {System.out.println(o);}
    public static void main(String[] args) {
        do {

            display();
            do {
                System.out.print("Please select an  function to execute  or 0 to exit ==>°°° ");
                choix = sc.nextInt();
            } while (choix < 0 || choix > 20);
            List<Integer> i = new ArrayList<>(List.of(15, 16, 18, 55, 20, 200, 58, 0, 1, 3));
            List<Integer> list2 = new ArrayList<>(List.of(15, 16, 120, 65, 20, 2020, 158, 0, 1, 3));
            List<String> s = List.of("Paul", "Jack", "Sahra", "Brain", "Lisa", "David", "Alan");
            operation(choix, s, i, list2);
        } while (choix != 0);
    }
    private static void display() {
        sop("---------------------------------------------------");
        sop("Please select the function to execute °°° ");
        sop("0 : Exit");
        sop("1 : reverse a input string ");
        sop("2 : Display three-digit 1-4 ");
        sop("3 : list the available character sets in charset objects.");
        sop("4 : print a ASCII value of a given character ");
        sop("5 : print a ASCII value of a given String ");
        sop("6 : Password input from console NotWorking ");
        sop("7 : capitalize the first letter of each word in a sentence");
        sop("8 : to find the penultimate (next to last) word of a sentence.");
        sop("9 : reverse a word.");
        sop("10 : extract the first half of a string of even length. \n");
        sop("11 : create the concatenation of the two strings except removing\n the first character of each string.\n The length of the strings must be 1 and above.");
        sop("12 : create a new string taking first three characters from a given string.\n If the length of the given string is less than 3 use # as\n substitute characters.\n");
        sop("13 : new string taking first and last characters from two given strings. \n If the length of either string is 0 use # for missing character. ");
        sop("14 : reverse a given String by a given position°");
    }
    private static void operation(int choix, List<String> s, List<Integer> i, List<Integer> j) {
        int search;
        String string = "";
        switch (choix) {
            case 0:
                System.exit(0);
            case 1:
                sop("please insert a value to reverse");
                string = sc.next();
                sop("the insert is \n\t" + string);
                sop("the reverse is \n\t" + Solution.Ex1_ReverseString(string));
                sc.next();
                break;
            case 2:
                Solution.Ex2_desplayDegit();
                sc.next();
                break;
            case 3:
                Solution.Ex3_AvailableCharset();
                sc.next();
                break;
            case 4:
                sop("please insert Character ");
                string = sc.next();
                sop("the ASCII code represent the Character { " + string + " } " +
                        "is { " + Solution.Ex4_CharacterToASCII(string) + " }");
                sc.next();
                break;
            case 5:
                sop("please insert values");
                string = sc.next();
                sop("list of ASCII \n\t" + Solution.Ex5_StrongToASCII(string));
                sc.next();
                break;
            default:
                sc.next();
                break;
        }
    }
} 