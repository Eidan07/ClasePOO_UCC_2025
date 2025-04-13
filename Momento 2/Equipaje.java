public class Equipaje {
    // Constantes
    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;
    
    // Atributos
    protected double peso;
    protected double tamanio;
    protected double precioBase;
    // Constructores
    public Equipaje (double peso, double tamanio){this.peso = peso; this.tamanio = tamanio; this.precioBase = precioBase;}
    public Equipaje (double precioBase){this.peso = PESO; this.tamanio = TAMANIO; this.precioBase = PRECIO_BASE;}
    public Equipaje () {this.peso = PESO; this.tamanio = TAMANIO; this.precioBase = PRECIO_BASE;}
    
    // Metodos
    public double calcularPrecio(){
    return 0.0;
    }
    // getters/setters de ser necesarios
}