package com.epam.rd.java.basic.practice1;

public class Part5 {
    public static int sum(String str) {
        int result = 0;

        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                try {
                    result += Integer.parseInt(String.valueOf(str.charAt(i)));
                } catch (NumberFormatException ex) {
                    return 0;
                }
            }
        } else {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print(sum(args[0]));

    }
}