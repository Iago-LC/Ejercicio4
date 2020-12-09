package boletín.pkg2;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
        int n;
        int blanco;
        int num = 0;
        int fig = 1;
        int punto;
        Scanner sc = new Scanner(System.in);

	System.out.println("Introduzca un número impar entre 3 e 15:");
        n = sc.nextInt();
        while (n % 2 == 0 || n < 3 || n > 15) {
            System.out.println("Error. O número introducido non é válido. Probe con outro");
            n = sc.nextInt();
        }

	System.out.println("");

        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        blanco = n / 2 - 1;
        punto = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            for (int j = 0; j < blanco; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 0; j < punto; j++) {
                System.out.print(".");
            }
            System.out.println("*");
            blanco--;
            punto = punto + 2;
        }

	System.out.print("*"); 
        for (int i = 0; i < n - 2; i++) {
            System.out.print(".");
        }
        System.out.println("*");

        blanco = 1;
        punto = n - 4;
        for (int i = 0; i < n / 2 - 1; i++) {
            for (int j = 0; j < blanco; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 0; j < punto; j++) {
                System.out.print(".");
            }
            System.out.println("*");
            blanco++;
            punto = punto - 2;
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }

}

