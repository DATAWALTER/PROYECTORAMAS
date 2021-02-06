package misrc;

/*
Autor: Ing. Walter Ismael Sagástegui Lescano
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            
            cls();
            System.out.print("\nMENU");
            System.out.print("\n====");
            System.out.print("\n(1) Suma");
            System.out.print("\n(2) Resta");
            System.out.print("\n(3) Multiplicación");
            System.out.print("\n(4) División");
            System.out.print("\n(0) Salir\n");

            System.out.print("\nOpcion? ");
            opcion = sc.next().trim().charAt(0);

            switch (opcion) {
                case '1':
                    cls();
                    opcion1();
                    pause();
                    break;
                case '2':
                    cls();
                    opcion2();
                    pause();
                    break;
                case '3':
                    cls();
                    opcion3();
                    pause();
                    break;
                case '4':
                    cls();
                    opcion4();
                    pause();
                    break;
                case '0':
                    cls();
                    System.exit(0);
                    break;
            }
        } while (true);

    }

    public static void opcion1() {
        System.out.print("\nOPCION 1");
        System.out.print("\n========");
    }

    public static void opcion2() {
        System.out.print("\nOPCION 2");
        System.out.print("\n========");
    }

    public static void opcion3() {
        System.out.print("\nOPCION 3");
        System.out.print("\n========");
    }

    public static void opcion4() {
        System.out.print("\nOPCION 4");
        System.out.print("\n========");
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
