package examen1ºtrimestre;

import java.util.Scanner;

public class Examen1ºTrimestre {

    public static Scanner datos = new Scanner(System.in);
    public static int tamMin;
    public static int tamMax;

    public static String[] crearIniArray(int tam) {
        boolean tamOk = true;
        if (tam < 0) {
            while (tamOk) {
                System.out.println("Introduce el tamaño");
                tam = datos.nextInt();
                if (tam > 0) {
                    tamOk = false;
                } else {
                    System.out.println("Tamaño no aceptado");
                    tamOk = true;
                }
            }
        }
        String[] miArray = new String[tam];

        return miArray;
    }

    public static boolean comprobarVocal(String laCadena, char laVocal) {
        boolean vocalEncontrada = false;
        char[] miArraydeChar = new char[laCadena.length()];
        for (int i = 0; i < laCadena.length(); i++) {
            miArraydeChar[i] = laCadena.charAt(i);
        }
        for (int i = 0; i < miArraydeChar.length; i++) {
            if (miArraydeChar[i] == laVocal) {
                vocalEncontrada = true;
            }
        }
        return vocalEncontrada;
    }

    public static void pideTamaños() {
        boolean pideTamOk = true;
        while (pideTamOk) {
            System.out.println("Introduce el tamMin");
            tamMin = datos.nextInt();
            System.out.println("Introduce el tamMax");
            tamMax = datos.nextInt();
            if (tamMin > 0 && tamMax > 0) {
                if (tamMin < tamMax) {
                    System.out.println("Correcto");
                    pideTamOk = false;
                } else {
                    System.out.println("Incorrecto");
                }
            } else {
                System.out.println("Incorrecto");
            }
        }
    }

    public static String[] rellenarArrayCadenas() {
        //1.
        System.out.println("Introduce el tamaño del array");
        int tam = datos.nextInt();
        String[] miArray = crearIniArray(tam);
        boolean vocalOk = true;
        //2.
        //Aqui me aseguro que lo que se pasa por parametro es una vocal y no una consonante
        System.out.println("Introduce una vocal");
        char laVocal = datos.next().charAt(0);
        while (vocalOk) {
            if (laVocal == 'a' || laVocal == 'e' || laVocal == 'i' || laVocal == 'o' || laVocal == 'u') {
                vocalOk = false;
            } else {
                System.out.println("Introduce una vocal");
                laVocal = datos.next().charAt(0);
            }
        }
        //3.
        pideTamaños();
        //4.
        for (int i = 0; i < miArray.length; i++) {
            boolean palabraOk = false;
            while (palabraOk == false) {
                System.out.println("Introduce la palabra de la posicion " + i + "(tamMin=" + tamMin
                        + "tamMax=" + tamMax + ")");
                String palabra = datos.next();
                if (palabra.length() >= tamMin && palabra.length() <= tamMax) {
                    palabraOk = comprobarVocal(palabra, laVocal);
                } else {
                    palabraOk = false;
                }
            }
        }
        //5.
        return miArray;
    }

    public static boolean comprobarPalabrasIguales(String[] lasPalabras) {
        boolean ok = false;
        int mitad = lasPalabras.length / 2;
        for (int i = 0; i < lasPalabras.length; i++) {
            int contadorIguales = 0;
            for (int j = 0; j < lasPalabras.length; j++) {
                if (lasPalabras[i].equalsIgnoreCase(lasPalabras[j])) {
                    contadorIguales++;
                }
            }
            if (contadorIguales > lasPalabras.length / 2) {
                ok = true;
            }
        }
        return ok;
    }

    public static void main(String[] args) {
        //EJERCICIO A
        //crearIniArray(-4);
        //EJERCICIO B
        //System.out.println(comprobarVocal("Hola", 'a'));
        //EJERCICIO C
        //pideTamaños();
        //EJERCICIO D
        //rellenarArrayCadenas();
        //EJERCICIO E
        //String[] miArray = {"Juan", "Hola", "Hola", "Hola"};
        //System.out.println(comprobarPalabrasIguales(miArray));
    }

}
