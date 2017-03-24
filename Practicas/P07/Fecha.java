
import java.util.*;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		int [] valFecha = new int [3];
		fecha.obtenerFecha(valFecha);
		System.out.println(valFecha[0]+" / "+ valFecha[1] +" / "+ valFecha[2]);
	}

	//public int leerFecha () {

	//}

	public void obtenerFecha (int [] valFecha) {

		Scanner datoFecha = new Scanner(System.in);
		System.out.println("Ingrese el anio: ");
		anio = datoFecha.nextInt();
		System.out.println("Ingrese el mes: ");
		mes = datoFecha.nextInt();
		System.out.println("Ingrese el dia: ");
		dia = datoFecha.nextInt();
		
		
	}

	public void validFecha () {
		if( anio > 1582 )
			System.out.println("El año que ingresaste no es valido");
		if( mes < 1 && mes > 12)
			System.out.println("El mes ingresado es incorrecto");
		if(dia < 1 && dia > 31 )
			System.out.println("El día ingresado es incorrecto");

	}

	public void asignarFecha () {
		if(validFecha()){
			
			valFecha [0] = dia;
			valFecha [1] = mes;
			valFecha [2] = anio;
		}

	}
}