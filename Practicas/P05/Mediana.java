public class Mediana{
	public static void main(String[] args) {
		int [] medArray = {2,8,7,5,4,3,9};

		//Ordering the array from lowest to highest
			for(int i=0; i < medArray.length; i++) {
				for(int j = i + 1; j < medArray.length; j++) {
					if(medArray[i] > medArray[j]) {
						int aux = medArray[i];
						medArray[i] = medArray[j];
						medArray[j] = aux;
					}
				}
			}
		 // Print all the array elements
         System.out.println("\nEstos son los valores del array ordenados de menor a mayor\n");

      for (int i = 0; i < medArray.length; i++) {
         System.out.println(medArray[i] );
      }

      System.out.println("\nLa mediana es: " + medArray[medArray.length/2]);

	}
}