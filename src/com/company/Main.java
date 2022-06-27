package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int speed = 10;
        if (speed < 10)
        System.out.println("Fast");
        if (speed < 20) {
            System.out.println("Faster");
        } else {
            System.out.println("Fastest");
        }

        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
        int c = 10;
        while (c>0){
            System.out.println(c);
            c--;
        }

        int b; //declaration
        b= 125;
        float ab= 45.6f;
        boolean tryout = true;
        char symbol = '#';
        System.out.println("ab");

        if (b < 125) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}
