package com.wmi;

import javax.xml.stream.events.Characters;
import java.nio.charset.Charset;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.wmi.Main.sop;

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
    static String Ex1_ReverseString1(String s){
        /*
            return  new StringBuilder(s).reverse().toString();
         */
        return Stream.of(s).map(ss->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
    }

    public static void Ex2_desplayDegit() {
        int i = 0, j = 0, k = 0, z = 0;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                for (k = 1; k <= 4; k++) {
                    if (i != j && i != k && k != j) {
                        sop(" " + i + j + k + " || ");
                        z++;
                    }
                }
                sop("\n");
            }
        }
        sop("z ==" + z);
    }

    public static void Ex3_AvailableCharset() {
        for(String s: Charset.availableCharsets().keySet()){
            sop(" " + s);
        }
    }

    public static String Ex4_CharacterToASCII(String string) {
        return "";
    }

    public static String Ex5_StrongToASCII(String string) {
        return "";
    }
}
