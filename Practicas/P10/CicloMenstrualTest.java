public class CicloMenstrualTest{
	public static void main(String[] args) {

		CicloMenstrual arrayCiclos[] = new CicloMenstrual[2];
		Reader reader = new Reader();
		int dia, mes, anio;

		for (int i=0; i < arrayCiclos.length; i++) {
			CicloMenstrual ciclo = new CicloMenstrual();
			
				
			System.out.println("Ingrese la fecha inicio de sangrado:");
			System.out.println("Proporciona el dia: ");
			dia = reader.leeInt();
			ciclo.getinicioSangrado().asignarFecha(dia,i+1);		
			//System.out.println(ciclo.getinicioSangrado());	

			System.out.println("Ingrese la fecha fin de sangrado:");
			System.out.println("Proporciona el dia: ");
			dia = reader.leeInt();
			ciclo.getfinSangrado().asignarFecha(dia, i+1);		
			//System.out.println(ciclo.getfinSangrado());

			arrayCiclos[i] = ciclo;
		}

		for (int i=0; i < arrayCiclos.length; i++) {
			System.out.println(arrayCiclos[i]);
		}


		
	}
}