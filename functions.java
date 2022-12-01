/* 
import java.util.*;

public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
    printMyName(name);

    }
}

import java.util.*;

public class functions {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         
        int sum = calculateSum( a, b);
        System.out.print("sum of 2 numbers is:"+sum);
    }
}

import java.util.*;
public class functions{
    public static int calculateMul(int c, int d){
        return c*d;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mul = calculateMul(c,d);
        System.out.print("Multiplication of 2 numbers is:" + mul);
    }
}*/  

import java.util.*;
public class functions{
    public static void printFactorial(int n){
        if(n<0){
            System.out.print("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i= n ; i>=1 ; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
        public static void main(String args []){
            Scanner scr = new Scanner(System.in);
            int n = scr.nextInt();
       
        printFactorial(n);
        }
}

