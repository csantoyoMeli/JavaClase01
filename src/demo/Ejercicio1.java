package demo;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese un número a procesar: ");
        int n = sc.nextInt();

        System.out.println("Los primeros n números pares son: ");

        int a = 0, i = 0;
        while(a < n) {
            if (i%2 == 0){
                System.out.println(i);
                a++;
            }
            i++;
        }

        sc.close();
    }
}
