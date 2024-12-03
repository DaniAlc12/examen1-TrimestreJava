package examen1ºtrimestre;

import java.util.Scanner;

public class ejercicio2 {

    public static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        boolean numOk = true;
        while (numOk) {
            System.out.println("Introduce un numero");
            int num = datos.nextInt();
            if (num > 0 && num % 2 != 0) {
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        if (j == i || j == num - i + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                numOk = false;
            } else {
                System.out.println("Numero no valido");
            }
        }

    }

}
