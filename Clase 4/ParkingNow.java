import java.util.Random;
import java.util.Scanner;
public class ParkingNow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] placas = new String[20];
        int opcion;
        do{ 
                do{
                System.out.println("Bienvenido a ParkingNow");
                System.out.println("<---------- MENÚ ---------->");
                System.out.println("Horario: 7:00am hasta 10:00pm");
                System.out.println("Seleccione una opción.");
                System.out.println("1. Registrar Moto.");
                System.out.println("2. Retirar Moto y relizar pago.");
                System.out.println("3. Mostrar espacios disponibles.");
                System.out.println("4. Salir del Menú.");
                System.out.println("Elige una opción");
                opcion = scanner.nextInt();
        }while (opcion < 1 || opcion  > 4 );
        switch (opcion){
            case 1:
                System.out.println("Ingrese la placa de la Moto.");
                registrarMoto( placas, scanner);
                break;
            case 2:
                System.out.println("");
                registrarMoto( placas, scanner);
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.exit(0);
                break;
        }
    }while(opcion != 4);
    }
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


    public static void retirarMoto (String[] placas, Scanner scanner){
        System.out.println("Ingrese la placa de la moto:");
        String placa = scanner.nextLine();
        Random random = new Random();
        int minutos =  random.nextInt(901);
        int pago;
        for (int i = 0; i < placas.length; i++) {
            if(placas[i] != null && placas[i].equalsIgnoreCase(placa)){
                pago = 0;
            }if (minutos <= 30){
            pago = 0;
            }if (minutos >= 31 && minutos <= 60) {
            pago = 800;
            }else if(minutos >= 61){
            pago = 2000;
            }
            
            }
            for(int i =0; i < placas.length; i++){
                if(placas[i] != null && placas[i].equalsIgnoreCase(placa)){
                    placas[i] = null;

                    System.out.println("La Moto ha salido correctamente.");
                    System.out.println("Tiempo total: " + minutos + "Minutos");
                    System.out.println("Monto total a pagar: $" + pago  );
                    return;
                }
            }
            System.out.println("No se encontró una moto");
    }