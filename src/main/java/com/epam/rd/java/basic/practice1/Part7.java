package com.epam.rd.java.basic.practice1;

public class Part7 {

    private static final String ARROW = " ==> ";
    
    public static void main(String[] args) {
        System.out.println("A" + ARROW + str2int("A") + ARROW + int2str(str2int("A")));
        System.out.println("B" + ARROW + str2int("B") + ARROW + rightColumn("A"));
        System.out.println("Z" + ARROW + str2int("Z") + ARROW + int2str(str2int("Z")));
        System.out.println("AA" + ARROW + str2int("AA") + ARROW + int2str(str2int("AA")));
        System.out.println("AZ" + ARROW + str2int("AZ") + ARROW + int2str(str2int("AZ")));
        System.out.println("BA" + ARROW + str2int("BA") + ARROW + int2str(str2int("BA")));
        System.out.println("ZZ" + ARROW + str2int("ZZ") + ARROW + int2str(str2int("ZZ")));
        System.out.println("AAA" + ARROW + str2int("AAA") + ARROW + int2str(str2int("AAA")));
    }

    public static int str2int(String number) {
        int result = (number.charAt(number.length() - 1) - 'A' + 1);
        int it = 1;
        for (int i = number.length() - 2; i >= 0; i--) {
            result += Math.pow(26, it) * (number.charAt(i) - 'A' + 1);
            it++;
        }
        return result;
    }

    public static String int2str(int number) {
        int c = number;
        StringBuilder sb = new StringBuilder();
        int b;
        while (c != 0) {
            c--;
            b = c % 26;
            sb.insert(0, (char) ('A' + b));
            c /= 26;
        }
        return number < 0 ? "" : sb.toString();
    }

    public static String rightColumn(String number) {
        int temp = str2int(number)+1;
        return int2str(temp);
    }
}
