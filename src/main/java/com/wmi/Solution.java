package com.wmi;

public class Solution {
    static String Ex1_ReverseString(String s){
        int i=s.length();
        StringBuilder ss= new StringBuilder();
        while(i>0){
            ss=ss.append(s.charAt(i-1));
            i--;
        }
        return ss.toString();
    }

    public static void Ex2_desplayDegit() {
    }

    public static void Ex3_AvailableCharset() {
    }

    public static String Ex4_CharacterToASCII(String string) {
        return "";
    }

    public static String Ex5_StrongToASCII(String string) {
        return "";
    }
}
