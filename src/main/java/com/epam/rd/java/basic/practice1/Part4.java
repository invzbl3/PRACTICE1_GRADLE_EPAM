package com.epam.rd.java.basic.practice1;

public class Part4 {
    public static int calculate(String first, String second) {
        int a;
        int b;

        try {
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
        } catch (NumberFormatException ex) {
            return 0;
        }

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.print(calculate(args[0], args[1]));
    }
}