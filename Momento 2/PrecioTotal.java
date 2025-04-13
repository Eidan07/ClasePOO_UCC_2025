// Inicio de la solución
public class PrecioTotal {
    // Atributos
    private double totalPrecios;
    private double totalBodega;
    private double totalCabina;
    private Equipaje[] equipaje;
    // Constructores
    public PrecioTotal(Equipaje[]equipaje){this.equipaje = equipaje;}
    // Metodos
    public void calcularTotales() {
        for (Equipaje e:equipaje){double precio = e.calcularPrecio();
            totalPrecios += precio; if (e instanceof Bodega) {totalBodega += precio;
            }else if (e instanceof Cabina) {totalCabina += precio;}   
        }
    }
    public void mostrarTotales() {
    // Calculo de totales
    calcularTotales();
    System.out.println("Total Equipaje " + totalPrecios);
    System.out.println("Total Bodega " + totalBodega);
    System.out.println("Total Cabina " + totalCabina);
    }
}