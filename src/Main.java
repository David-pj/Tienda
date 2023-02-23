import java.util.Scanner;

public class Main {
    static Scanner teclado =new Scanner(System.in);

    public static void  main(String[] args){

        double ValMouse=45000,ValMonitor=950000, ValTeclado=60000, ValDisco = 280000, ValRam=125000;
        int CantMouse, CantMonitor, CantTeclado, CantDisco, CantRam;
        int ValorTotalMouse, ValorTotalMonitor, ValortTotalTeclado, ValorTotalDisco, ValorTotalRam;
        int Mouse;
        int Monitor;
        int Teclados;
        int Disco;
        int Ram;
        int opcion;

        System.out.println(1=Mouse, 2= Monitor, 3= Teclados, 4= Disco, 5= Ram);

        opcion=teclado.nextInt();
        if (opcion == 1) {
            System.out.println("Compro Mouse");
            System.out.println("¿Cuantos Mouse desea comprar?");
            CantMouse = teclado.nextInt();
            ValorTotalMouse = ValMouse*CantMouse;
        }
        else if (opcion == 2) {
            System.out.println("Compro Monitor");
            System.out.println("¿Cuantos Monitores desea comprar?");
            CantMouse = teclado.nextInt();
            ValorTotalMonitor = ValMonitor*CantMonitor;
        }
        else if (opcion == 3) {
            System.out.println("Compro Teclado");
            System.out.println("¿Cuantos Teclados desea comprar?");
            CantMouse = teclado.nextInt();

        }
        else if (opcion == 4) {
            System.out.println("Compro Disco");
            System.out.println("¿Cuantos Discos desea comprar?");
            CantMouse = teclado.nextInt();
        }
        else if (opcion == 5) {
            System.out.println("Compro Ram");
            System.out.println("¿Cuantas Tarjetas de momoria Ram desea comprar?");
            CantMouse = teclado.nextInt();
        }

        ValorTotalMouse = ValMouse*CantMouse;



}