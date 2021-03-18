package demo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Ejercicio 5
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Por favor ingrese m: ");
        int m = sc.nextInt();

        System.out.print("Por favor ingrese d: ");
        int d = sc.nextInt();

        System.out.println("Los primeros n números que comparten m digitos d son: ");

        int a = 0, i = 0;
        while(a < n) {
            if ( haveDigits(i, m, d)) {
                System.out.println(i);
                a++;
            }
            i++;
        }
        sc.close();
    }

    public static boolean haveDigits(int num, int amount, int digit) {

        // Take bum and digit as Strings
        String number = String.valueOf(num);
        String d = String.valueOf(digit);

        // Creating an array of digits
        String[] digits = number.split("");
        int a = 0;

        for (String j : digits) {
            if (j.equals(d)) a++;
        }

        return a == amount;
    }
}
