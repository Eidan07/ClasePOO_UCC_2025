import java.util.Random;
import java.util.Scanner;

// Clase Padre Arma
abstract class Arma {
    protected String nombre;
    protected int dano;
    protected Random rand;
    
    public Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
        this.rand = new Random();
    }
    
    public abstract int usar(Personaje atacante, Personaje defensor);
    
    public String getNombre() {
        return nombre;
    }
}