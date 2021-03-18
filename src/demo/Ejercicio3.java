package demo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese n: ");
        int n = sc.nextInt();

        int m = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) m++;
        }
        if (m == 2) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        sc.close();
    }
}
