package Ejerciocios;


import java.util.Scanner;
import java.util.Random;

public class Main {
    public static String[][] board = new String[10][10];
    public static String character = "  x  "; // 5 espacios y en la posicion 3 va el caracter para mantener simetria


    public static String[] prizes = {" celular ", " peluche ", "  dulce  "};
    static Prize celular = new Prize(" celular ", 300, 3);
    static Prize peluche = new Prize(" peluche ", 250, 2);
    static Prize dulce = new Prize("  dulce  ", 12, 1);


    public static void garra(String coordinates) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        //int rand1 = rnd.nextInt(0, 3);
        double min = 0.0;
        double max = 2.1;
        // Generar un número aleatorio entre 0.0 y 1.0 y luego escalarlo al rango deseado
        double numeroAleatorio = min + (max - min) * rnd.nextDouble();
        System.out.println("Número aleatorio: " + numeroAleatorio);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opc;
        do {
            System.out.println("\n\nElija el ejercicio que quiere revisar");
            System.out.println("""
                    1.- ejercicio 1 password update 
                    2.- ejercicio2 primeros 15 multiplos de un numero
                    3.- ejercicio 3 Coordenadas
                    4.- "Ejercicio 4 ! LA GAAARRA!"
                    5.- salir y finaliza""");


            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("EJERCICIO 1 LOGIN");
                    String password = "contra123";
                    String intento;
                    int counter = 0;
                    do {
                        System.out.println("Ingrese el password");
                        intento = sc.nextLine();
                        counter++;
                        if (intento.equals(password)) {
                            System.out.println("inicio de sesion realizado correctamente");
                        } else if (counter == 3) {
                            System.out.println("HA ALCANZADO EL NUMERO MAXIMO DE INTENTOS\nActualize su password");
                            password = sc.nextLine();
                            counter = 0;


                        } else {
                            System.out.println("!! Password incorrecto, intentelo de nuevo !!");
                        }

                    } while (!intento.equals(password));
                    break;
                case 2:
                    System.out.println("EJERCICIO 2 MULTIPLOS DE 15");
                    System.out.println("Ingresa un numero");
                    float num = sc.nextFloat();
                    for (int i = 1; i <= 15; i++) {
                        System.out.println(num * i);

                    }
                    break;
                case 3:
                    sc.nextLine(); // para resetear o limpiar el buffer del Scanner
                    System.out.println("EJERCICIO 3 COORDENADAS");
                    int opcE3 = 0; // opcion del Ejercicio 3
                    String coordinates;
                    int x, y;


                    while (opcE3 != 1) {
                        System.out.println("Ingresa una cooredenada");
                        coordinates = sc.nextLine();
                        x = Integer.parseInt(coordinates.split(",")[0]);
                        y = Integer.parseInt(coordinates.split(",")[1]);
                        board[x][y] = character;
                        //--------------------------------------------------------------------

                        String arrow = "-------------------------------------------------------------";
                        for (int i = 0; i < 10; i++) {
                            if (i == 0) {
                                System.out.println(arrow);
                            }
                            for (int j = 0; j < 10; j++) {
                                if (board[i][j] == null) {
                                    board[i][j] = "     "; // 5 espacios
                                }
                                System.out.print("|" + board[i][j] + (j == 9 ? "|" : ""));
                            }
                            System.out.println(i == 9 ? "" : "\n" + arrow);

                        }
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("Presiona 1 para regresar al menu pricipal o cualquier otro numero para continuar");
                        opcE3 = sc.nextInt();
                        sc.nextLine(); // para limpiar el buffer del Scanner
                    }
                    break;
                case 4:
                    System.out.println("Ejercicio 4 ! LA GAAARRA!");


                    Prize dulce1 = new Prize("  dulce  ", 12, 1);
                    Prize dulce2 = new Prize("  dulce  ", 12, 1);
                    Prize dulce3 = new Prize("  dulce  ", 12, 1);

                    Prize peluche1 = new Prize(" peluche ", 250, 2);
                    Prize peluche2 = new Prize(" peluche ", 250, 2);
                    Prize peluche3 = new Prize(" peluche ", 250, 2);
                    Prize peluche4 = new Prize(" peluche ", 250, 2);
                    Prize celular = new Prize(" celular ", 300, 3);
                    Prize[] tray1 = new Prize[2];
                    Tray tray = new Tray(tray1," bandeja ");

                    tray1[0] = celular; // solo para comprobar que se pueden guardar objetos en la bandeja

                    ///*

                    Object[][] mesh = new Object[][]{
                            {  dulce1.getName(), peluche3.getName(),  celular.getName()},
                            {peluche1.getName(),   dulce2.getName(), peluche4.getName()},
                            {    tray.getName(), peluche2.getName(),   dulce3.getName()},

                    };

                     //*/
                    /*


                    Object[][] mesh = new Object[][]{
                            {dulce1, peluche3, celular},
                            {peluche1, dulce2, peluche4},
                            {" bandeja ", peluche2, dulce3},

                    };
                    */
                    //Main.garra();
                    System.out.println("EJERCICIO 4 GARRA\n");

                    int back = 0;
                    System.out.println("1 moneda = 1 intento\nIngresa tus monedas: ");
                    int tries = sc.nextInt();
                    sc.nextLine(); // para resetear o limpiar el buffer del Scanner

                    do {
                        //se piden las coordenadas
                        System.out.println("Ingresa una cooredenada X,Y");
                        coordinates = sc.nextLine();
                        int x1 = Integer.parseInt(coordinates.split(",")[0]);
                        int y1 = Integer.parseInt(coordinates.split(",")[1]);
                        //Main.garra();
                        //mesh[x1][y1].getWeight();
                        //mesh[x1][y1].getDifficulty();






                        System.out.println("Presiona 1 para continuar jugando o 2 para regresar al menu principal");
                        back = sc.nextInt();
                    } while (tries > 0 && back != 2);
                    sc.nextLine(); // para resetear o limpiar el buffer del Scanner


                    //se imprime el tablero o tray
                    String arrow = "-------------------------------";
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (mesh[i][j] == null) {
                                mesh[i][j] = ("  null   ");
                            }
                            System.out.print("|" + mesh[i][j] + (j == 2 ? "|" : ""));
                        }
                        System.out.println(i == 2 ? "" : "\n" + arrow);
                    }

                    System.out.println("\nen la bandeja hay un " + tray1[0].getName());

                    break;
                case 5:


                    break;
                case 6:
                    System.out.println(" ADIOS XD ");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }

        } while (opc != 6);


    }
}