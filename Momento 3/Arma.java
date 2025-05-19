import java.util.Random;
import java.util.Scanner;
// Clase Padre Arma
class Arma {
    protected String nombre;
    protected int dano;
    protected Random rand;
    
    public Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
        this.rand = new Random();
    }
    
    public int usar(Personaje atacante, Personaje defensor) {
        System.out.println(atacante.getNombre() + " usa " + nombre);
        return dano;
    }
    
    public String getNombre() {
        return nombre;
    }
}

