import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del auto
        System.out.print("Ingrese la marca del auto: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del auto: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el color del auto: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese la velocidad máxima del auto: ");
        int velocidadMaxima = scanner.nextInt();

        // Crear objeto auto
        Auto miAuto = new Auto(marca, modelo, color, velocidadMaxima);
        miAuto.mostrarInfo();

        // Menú interactivo
        int opcion = 0;
        do {
            System.out.println("\nSeleccione que desea hacer:");
            System.out.println("1- Encender auto");
            System.out.println("2- Apagar auto");
            System.out.println("3- Acelerar auto");
            System.out.println("4- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miAuto.encender();
                    break;
                case 2:
                    miAuto.apagar();
                    break;
                case 3:
                    miAuto.acelerar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
