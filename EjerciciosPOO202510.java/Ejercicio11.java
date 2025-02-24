public class Ejercicio11{
    public static void main (String[] args){
        /* Dado un arreglo A de N elementos se desea generar tres arreglos 
        que contengan los elementos negativos, cero y positivos de arreglo inicial. */
        //Creacion del arreglo a de enteros n elementos
      
        //declaración del arreglo del tamaño
        int n = (int) (Math.random() * (30 - 15)) + 15;
        int[] a = new int[n];
        
        //Llenar el arreglo con numeros comprendidos entre -2' y 2'
        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * (20 + 20)) -20;
        } 
        
    //Mostrar el arreglo para validar que se estan guardando los elementos
        for(int i = 0; i < a.length; i++) {
            System.out.println("" + a[i]);
        }
        System.out.println();     
    }
}
