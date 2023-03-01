import javax.swing.*;
import java.util.Scanner;

public class Universidad {

    static Estudiante[] estudiantes = new Estudiante[100];
    static Scanner in = new Scanner(System.in);

    int opcion;

    do {
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar todos los estudiantes");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opcion: ");
        opcion = in.nextInt();

        switch (opcion){
            case 1:
                public static Estudiante aggEstudiante(){
                System.out.println("Ingrese el nombre del estudiante");
                String nombre = in.nextLine();
                System.out.println("Ingrese la edad del estudiante");
                int edad = in.nextInt();
                System.out.println("Ingrese el codigo del estudiante");
                int codigo = in.nextInt();
                return new Estudiante;
            }break;

            case 2:
                public static void mostrarEstudiantes(){
                for(int i = 0; i < estudiantes.length; i ++){
                    System.out.println("El nombre del estudiante en la posicion " + i + "es: " + estudiantes[i].getNombre()
                            + " " + "La edad del estudiante en la posicion " + i + "es: " + estudiantes[i].getEdad()
                            + " " + "El codigo del estudiante en la posicion " + i + "es: " + estudiantes[i].getCodigo()
                    );
                }
            }break;

            case 3:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Opcion invalida");
        }


    }
     while (opcion != 3);

}


   /*public static Estudiante aggEstudiante(){
       System.out.println("Ingrese el nombre del estudiante");
       String nombre = in.nextLine();
       System.out.println("Ingrese la edad del estudiante");
       int edad = in.nextInt();
       System.out.println("Ingrese el codigo del estudiante");
       int codigo = in.nextInt();
     return new Estudiante();
    }*/

    /*public static void mostrarEstudiantes(){
        for(int i = 0; i < estudiantes.length; i ++){
            System.out.println("El nombre del estudiante en la posicion " + i + "es: " + estudiantes[i].getNombre()
            + " " + "La edad del estudiante en la posicion " + i + "es: " + estudiantes[i].getEdad()
                    + " " + "El codigo del estudiante en la posicion " + i + "es: " + estudiantes[i].getCodigo()
                    );
        }
    }*/


