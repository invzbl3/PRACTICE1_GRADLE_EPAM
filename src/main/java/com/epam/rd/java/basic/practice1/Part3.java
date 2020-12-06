package com.epam.rd.java.basic.practice1;

public class Part3 {
    public static void main(String[] args) {
        System.out.print(Part3.display(args));
    }

    public static String display(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        if (args.length == 0) {
            return "";
        }
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] != null) {
                stringBuilder.append(args[i].trim()).append("\u0020");
            }
        }
        return stringBuilder.append(args[args.length - 1]).toString();
    }
}
