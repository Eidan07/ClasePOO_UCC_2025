public class Bodega extends Equipaje {
    // Constantes
    private static final double CAPACIDAD = 8.0;
    
    // Constructores
    public Bodega (double peso, double tamanio){super(peso, tamanio);}
    public Bodega (double precioBase){super(precioBase);}
    public Bodega () {super();}
    
    // Metodos
    public double calcularPrecio(){
    // Calculos
    double calcularPrecioBodega = precioBase + (peso * tamanio * CAPACIDAD);
    double precioFinal = calcularPrecioBodega;
    return precioFinal;
    }
    // getters/setters de ser necesarios
}