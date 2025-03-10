import java.util.Random;
import java.util.Scanner;

public class ParkingNow2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] placas = new String[20];
        int opcion;

        do { 
            do {
                System.out.println("Bienvenido a ParkingNow");
                System.out.println("<---------- MENÚ ---------->");
                System.out.println("Horario: 7:00am hasta 10:00pm");
                System.out.println("Seleccione una opción.");
                System.out.println("1. Registrar Moto.");
                System.out.println("2. Retirar Moto y realizar pago.");
                System.out.println("3. Mostrar espacios disponibles.");
                System.out.println("4. Salir del Menú.");
                System.out.print("Elige una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    registrarMoto(placas, scanner);
                    break;
                case 2:
                    retirarMoto(placas, scanner);
                    break;
                case 3:
                    mostrarEspaciosDisponibles(placas);
                    break;
                case 4:
                    System.out.println("Gracias por usar ParkingNow.");
                    System.exit(0);
                    break;
            }
        } while (opcion != 4);
    }

    public static void registrarMoto(String[] placas, Scanner scanner) {
        System.out.print("Ingrese la placa de la moto: ");
        String placa = scanner.nextLine();

        for (int i = 0; i < placas.length; i++) {
            if (placas[i] == null) {
                placas[i] = placa;
                System.out.println("Moto registrada con éxito en la posición: " + (i + 1));
                return;
            }
        }
        System.out.println("No hay espacios disponibles.");
    }

    public static void retirarMoto(String[] placas, Scanner scanner) {
        System.out.print("Ingrese la placa de la moto: ");
        String placa = scanner.nextLine();
        
        Random random = new Random();
        int minutos = random.nextInt(901); // Tiempo aleatorio entre 0 y 900 minutos
        int pago = 0; // Inicializar pago

        if (minutos <= 30) {
            pago = 0;
        } else if (minutos <= 60) {
            pago = 800;
        } else {
            pago = 2000;
        }

        for (int i = 0; i < placas.length; i++) {
            if (placas[i] != null && placas[i].equalsIgnoreCase(placa)) {
                placas[i] = null; // Eliminar la moto

                System.out.println("La moto ha salido correctamente.");
                System.out.println("Tiempo total: " + minutos + " minutos");
                System.out.println("Monto total a pagar: $" + pago);
                return;
            }
        }
        System.out.println("No se encontró una moto con esa placa.");
    }

    public static void mostrarEspaciosDisponibles(String[] placas) {
        int disponibles = 0;
        for (String placa : placas) {
            if (placa == null) {
                disponibles++;
            }
        }
        System.out.println("Espacios disponibles: " + disponibles);
    }
}