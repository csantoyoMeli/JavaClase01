package demo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Ejercicio 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Por favor ingrese m: ");
        int m = sc.nextInt();

        System.out.println("Los números multiplos de m hasta el número ingresado n son: ");


        for (int i = 1; i <= n; i++){
            System.out.println(i*m);
        }

        sc.close();
    }
}
