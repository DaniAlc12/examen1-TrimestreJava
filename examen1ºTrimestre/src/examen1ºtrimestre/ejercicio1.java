package examen1ºtrimestre;

import java.util.Scanner;

public class ejercicio1 {

    public static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        boolean todasVocales = true;
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        while (todasVocales) {
            int aContador = 0;
            int eContador = 0;
            int iContador = 0;
            int oContador = 0;
            int uContador = 0;
            System.out.println("Introduce la cadena");
            String laCadena = datos.next();
            char primeraVocal=' ';
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'a' || laCadena.charAt(x) == 'e' || laCadena.charAt(x) == 'i'
                        || laCadena.charAt(x) == 'o' || laCadena.charAt(x) == 'u') {
                    primeraVocal=laCadena.charAt(x);
                    break;
                }
            }
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'a') {
                    a = true;
                    aContador++;
                }
            }
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'e') {
                    e = true;
                    eContador++;
                }
            }
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'i') {
                    i = true;
                    iContador++;
                }
            }
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'o') {
                    o = true;
                    oContador++;
                }
            }
            for (int x = 0; x < laCadena.length(); x++) {
                if (laCadena.charAt(x) == 'u') {
                    u = true;
                    uContador++;
                }
            }
            if (a && e && i && o && u) {
                System.out.println("Se han introducido todas las vocales");
                System.out.println("a:" + aContador + "\ne:" + eContador + "\ni:" + iContador
                        + "\no:" + oContador + "\nu:" + uContador);
                System.out.println("La primera vocal ha sido:" + primeraVocal);
                todasVocales = false;
            } else {
                System.out.println("Cadena no valida,introduce otra");
            }
        }
    }

}
