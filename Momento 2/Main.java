public class Main {
    public static void main(String[] args) {
        Equipaje equipaje[] = new Equipaje[5]; 
        equipaje[0] = new Bodega(10.0, 4.5); 
        equipaje[1] = new Bodega(1000.0); 
        equipaje[2] = new Cabina(10.0, 4.5); 
        equipaje[3] = new Cabina(); 
        equipaje[4] = new Bodega(); 
        PrecioTotal solucion = new PrecioTotal(equipaje); 
        solucion.mostrarTotales(); 
    }
}