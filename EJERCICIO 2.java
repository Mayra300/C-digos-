import java.util.Scanner;

class Empleado {
    private String nom;
    private int numeroEm;

    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nom = entrada.nextLine();
        System.out.print("Ingrese el número de empleado: ");
        numeroEm = entrada.nextInt();
    }

    public void verDatos() {
        System.out.println("Nombre: " + nom);
        System.out.println("Número de Em: " + numeroEm);
    }
}


class poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //arreglo de 50 empleados
        Empleado[] e = new Empleado[50];

        // Llenar el arreglo
        for (int i = 0; i < 50; i++) {
            e[i] = new Empleado();
            System.out.println("\nIngrese los datos para el empleado " + (i + 1));
            e[i].leerDatos();
        }

        // Visualizar los datos de todos los empleados
        System.out.println("Datos de los 50 empleados:\n");
        for (int i = 0; i < 50; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            e[i].verDatos();
            System.out.println();
        }
    }
} 