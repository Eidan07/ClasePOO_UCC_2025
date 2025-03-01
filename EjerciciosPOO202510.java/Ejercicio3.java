public class Ejercicio3 {
    public static void main (String[] args){
        /*Dado un arreglo lineal de números, 
        sumar separadamente los números pares y los 
        números impares.  */

        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sumaImpares = 0;
        int sumaPares = 0;

        for (int i = 0; i < numeros.length; i++){
            if ( i % 2 == 0){
                i += sumaPares;
            }else{
                i += sumaImpares;
            }
        
            System.out.println("Suma de números pares: " + sumaPares);
            System.out.println("Suma de números impares: " + sumaImpares);

        }        
    }
}