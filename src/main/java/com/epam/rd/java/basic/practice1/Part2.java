package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {

        System.out.print(Part2.addition(args));
    }

    public static int addition(String[] args) {
      
        int result = 0;
        try {
            for (int i = 0; i < args.length; i++) {
                result += Integer.parseInt(args[i]);
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e){
            return 0;
        }
        return result;
    }
	
}
