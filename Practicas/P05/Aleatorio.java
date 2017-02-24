import java.io.*;
import java.util.*;

public class Aleatorio{
	public static void main(String[] args)throws IOException {

		InputStreamReader leer = new InputStreamReader(System.in);
		BufferedReader fEntrada = new BufferedReader(leer);

		      int i = 0, contador = 0, terminacion = 0;


		System.out.println("Numero de elementos del arreglo:");
		int n = Integer.parseInt(fEntrada.readLine());
		double[] arregloAl = new double[n];

		int min = 1, max = 300;

		for ( i = 0; i < n; i++ ) {

			double aleatorio = Math.random() * ( min - max ) + max;
			aleatorio = (int)aleatorio;
			arregloAl[i] = aleatorio;
      }

      	System.out.println("\n¿Cual es el valor de la terminación que se mostrara?");
      	terminacion = Integer.parseInt(fEntrada.readLine());

      	
      	for( i = 0; i < n; i++){

      		System.out.println( (int)arregloAl[i] );

      		if (arregloAl[i]%10 == terminacion){
      		contador = contador+1;
      	}
      }
      	double[] arregloTerminacion = new double[contador];
        //System.out.println("\nTamaño de mi arreglo: " + arregloTerminacion.length);
       // System.out.println("Contador: " + contador);

        for(i = 0; i < n; i++){
            if (arregloAl[i]%10 == terminacion){
              for(int j = 0; j < arregloTerminacion.length; j++){
                arregloTerminacion[j] = arregloAl[i]; 
              }
            }
          }

         if(contador == 0){

            System.out.println("No se generó ningún número con esa terminación");
          }else if(contador > 0){
            System.out.println("\n === \nArreglo Terminación\n === \n");
		}
        for(i=0; i < arregloTerminacion.length; i++){
              System.out.println((int)arregloTerminacion[i]);
            }
  


	}
}