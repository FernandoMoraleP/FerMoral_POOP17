
import java.io.*;

public class AluCal{
	public static void main(String[] args) {

		//int cAlumnos;
		
		InputStreamReader leer = new InputStreamReader(System.in);
		BufferedReader fEntrada = new BufferedReader(leer);

		String [] nAlum = new String [10];

		String [] cAlum1 = {", Reprobado", ", Bien", ", Notable", ", Sobresaliente"};
		
		int [] cAlum = new int [10];

try { 

	System.out.println("\n Ingrese el nombre de los 10 alumnos. \n");
	//filling up the name array 
	for (int i =0; i < nAlum.length; i++) {

		 System.out.println("Alumno ["+ i +"]");

		 nAlum[i] = fEntrada.readLine();
	  }

	System.out.println("\n Ingrese la calificación de los 10 alumnos. \n");

	  	//filling up the grade array 
	  for ( int i = 0; i < cAlum.length; i++ ) {

		 System.out.println("Calificación ["+ i +"]");

		 cAlum[i] = Integer.parseInt(fEntrada.readLine());

		 if(cAlum[i] < 0 || cAlum[i] > 10){

		 	System.out.println("La calificación debe estar entre los valores 0 y 10");

		 cAlum[i] = Integer.parseInt(fEntrada.readLine());
		}
	  }
		
  }catch (IOException d){}
		
  	// Print all the array elements
      for (int i = 0; i < cAlum.length; i++) {

      	if ( cAlum[i] >= 0 && cAlum[i] <= 4.99)

			System.out.println("\n" + nAlum[i] + " Calif. " + cAlum[i] + cAlum1[0]);

      	if ( cAlum[i] >= 5 && cAlum[i] <= 6.99) 

			System.out.println("\n" + nAlum[i] + " Calif. " + cAlum[i] + cAlum1[1]);

      	if ( cAlum[i] >= 7 && cAlum[i] <= 8.99) 

			System.out.println("\n" + nAlum[i] + " Calif. " + cAlum[i] + cAlum1[2]);

      	if ( cAlum[i] >= 9 && cAlum[i] <=10) 

			System.out.println("\n" + nAlum[i] + " Calif. " + cAlum[i] + cAlum1[3]);

        
      }
	 


		

	}
}