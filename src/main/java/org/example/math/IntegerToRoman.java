package org.example.math;

public class IntegerToRoman {
    public String intToRoman(int num) {

        String romanWord[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int i = romanWord.length - 1;
        String sol = "";

        while(num>0){

            while(value[i]<=num){
                System.out.println("*");
                sol += romanWord[i];
                num -= value[i];

            }
            i--;
        }
        System.out.println(sol);
        return sol;
    }
}
