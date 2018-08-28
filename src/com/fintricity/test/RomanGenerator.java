package com.fintricity.test;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class RomanGenerator {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final String convertIntegerToRoman(int number) {
        if(number > 0) {
            int firstFitKey = map.floorKey(number);
            if (number == firstFitKey) {
                return map.get(number);
            }
            return map.get(firstFitKey) + convertIntegerToRoman(number - firstFitKey);
        }
        else{
            return "Conversion to Roman not possible";
        }
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println(IntStream.of(input).mapToObj(new RomanGenerator()::convertIntegerToRoman).reduce("", (x, y) -> x + y).toString());


    }
}
