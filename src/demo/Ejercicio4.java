package demo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio 4
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese n: ");
        int n = sc.nextInt();
        int m = 0, i = 1;

        System.out.println("Los primeros n números primos son: ");
        while (m < n){

            if (isPrimo(i)){
                System.out.println(i);
                m++;
            }
            i++;
        }

        sc.close();
    }

    public static boolean isPrimo(int num) {
        int a = 0;
        for (int i = 1; i <= num; i++){
            if (num%i == 0) a++;
        }
        return a == 2;
    }
}
