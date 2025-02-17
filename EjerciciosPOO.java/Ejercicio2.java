public class Ejercicio2 {
    public static void main (String[] args){

        /*
         * Se tienen N epleados de una compañía y se ha idea llenar un arreglo
         * lineal A con sueldos de los empleados, un arreglo B con las asignaciones
         * totales de cada empleado, una rreglo C con las dedudcciones de cada uno.
         * (Neto a pagar = sueldo + asigfnaciones - deducciones)
         */

         //Tener en cuenta que todos los arreglos todos deben ser del mismo tamaño
         //Sueldos de los empleados
         double[] A = {1000.0, 1350.0, 900. };
         //Asignaciones totales de cada empleado
         double[] B = {100.0, 230.0, 150.0 };
         //Deducciones de cada empleado
         double[] C = {20.0, 35.0, 10.0};

         //Arreglo que almacena el neto a pagar de cada empleado Ej: A.lenght --> 3
         double[] T = new double[A.length];
         //Asignación de la formula a cada posiciópn del arreglo
         for(int i = 0; i < T.length; i++){
            T[i] = A[i] + B[i] - C[i];
         }

          //Mostrar el neto a pagar de los enpleados
          for(int i = 0; i < T.length; i++){
            System.out.println("T[" + i +"]=" + T[i]);
    }
}
