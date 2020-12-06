package com.epam.rd.java.basic.practice1;

public class Part6 {
    public static void main(String[] args) {
        int lengthOArray = Integer.parseInt(args[0]); // Length of array
        System.out.print(Part6.prime(lengthOArray));
    }

    public static String prime(int lengthOArray) {
        int[] simpleArray = new int[lengthOArray]; // Array of simple numbers
        int nextNumber = 2; // Testing number
        int counter = 0; // Counter of filling element of array
        boolean isSimple;
        while (counter < lengthOArray) {
            int i = 0;
            isSimple = true;
            while (isSimple && i < counter) {
                if (nextNumber % simpleArray[i] == 0) {
                    isSimple = false;
                }
                i++;
            }
            if (isSimple) {
                simpleArray[counter] = nextNumber;
                counter++;
                nextNumber++;
            } else {
                nextNumber++;
            }
        }

        return join(simpleArray, " ");
    }

    public static String join(int[] array, String sep) {
        if(array.length == 0) return "";
        if(array.length == 1) return String.valueOf(array[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for(int i = 1; i < array.length; i++) {
            sb.append(sep);
            sb.append(array[i]);
        }
        return sb.toString();
    }
}