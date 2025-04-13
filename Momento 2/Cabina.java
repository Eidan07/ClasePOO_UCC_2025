public class Cabina extends Equipaje {
    // Constantes
    private final static int TIEMPO = 2;
    // Constructores
    public Cabina (double peso, double tamanio){super(peso, tamanio);}
    public Cabina (double precioBase){super(precioBase);}
    public Cabina (){super();}
    // Metodos
    public double calcularPrecio(){
    // Calculos
    double calcularPrecioCabina = precioBase + (peso * tamanio * TIEMPO);
    double precioFinal = calcularPrecioCabina;
    return precioFinal;
    }
    // getters/setters de ser necesarios
}