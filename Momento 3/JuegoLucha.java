import java.util.Scanner;
import java.util.Random;
public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    private Random rand;
    private Scanner scanner;

    public JuegoLucha(String nombre1, String nombre2) {
        jugador1 = new Personaje(nombre1);
        jugador2 = new Personaje(nombre2);
        this.rand = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarPelea() {
        System.out.println("La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...");
        System.out.println(" Cada jugador comienza con una espada y un escudo. ");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println(jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre() + ". Puntos de vida: " + atacante.getPuntosDeVida() +" | Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        
        System.out.println("1. Atacar con espada");
        System.out.println("2. Activar escudo (para el próximo ataque enemigo) (Tiene 50% de probabilidad de bloquear el ataque)");
        System.out.println("3. Lanzar bola de fuego (30% de probabilidad)");
        System.out.print("Elige una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                atacante.atacar(defensor);
                break;
            case 2:
                atacante.activarEscudo();
                break;
            case 3:
                if (rand.nextDouble() < 0.3) {
                    atacante.bolaDeFuego(defensor);
                } else {
                    System.out.println(" Fallaste. ");
                }
                break;
            default:
                System.out.println("Opción inválida. Atacas con espada por defecto.");
                atacante.atacar(defensor);
        }
        
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
}