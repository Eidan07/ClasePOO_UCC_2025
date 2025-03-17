public class Ejecutar {
    public static void main(String[] args) {

        // Instanciar Creación del Objeto (Creación)
        Estudiante objEst1 = new Estudiante(1, "Eidan", "Zuñiga", 18, "Ingienería");
        Estudiante objEst2 = new Estudiante(2, "Juan", "Castro", 20, "Derecho");

        System.out.println(objEst1.toString()); 
        System.out.println(objEst2); //toString

        //Modificar la edad del estudiante
        objEst1.setEdad(20);

        System.out.println(objEst1);
    }
}