import java.util.Random;
import java.util.Scanner;
class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 80;
    private final int MIN_DANO = 60;
    private final int BOLA_DE_FUEGO = 100; //Se añadió un ataque especial
    
    //Constructor para inicializar los datos del personaje
    
    public Personaje(String nombre) {
    this.nombre = nombre;
    this.puntosDeVida = 300; // Todos comienzan con 300 puntos de vida
}

    // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
    Random rand = new Random();
    int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // Dano entre 80 y 60
    oponente.recibirDano(dano);
    System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de dano.");
    }

    //Metodo para lanzar una bola de fuego
public void bolaDeFuego(Personaje oponente) {
    oponente.recibirDano(BOLA_DE_FUEGO);
    System.out.println(this.nombre + " lanza una BOLA DE FUEGO contra " + oponente.getNombre() + " causando " + BOLA_DE_FUEGO + " puntos de daño.");
    }

    //Metodo para recibir daño
    public void recibirDano(int dano) {
    this.puntosDeVida-= dano;
        if (this.puntosDeVida < 0) {
        this.puntosDeVida = 0; // No se puede tener menos de 0 puntos de vida
    }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
    return this.puntosDeVida > 0;
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
    return this.nombre;
}

    // Devuelve los puntos de vida actuales
    public int getPuntosDeVida() {
    return this.puntosDeVida;
    }


}
