package com.Sensen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        int num = 10;
        System.out.println(num);
        //int num2 = num + 3;
        // discard digits, not ceiling or floor
        System.out.println(-10 / 3);
        System.out.println(-14 % 3);
        num = num - 1;
        num -= 1;
        System.out.println(num);


        int num1 =  10;
        int num2 = 15;
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println(num1);
        System.out.println(num2);
    }
}
