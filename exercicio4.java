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
