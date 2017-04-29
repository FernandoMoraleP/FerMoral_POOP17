public class DatosPersonalesTest{
	public static void main(String[] args) {

		DatosPersonales datos = new DatosPersonales();
		DatosPersonalesSeguros datosSeguros = new DatosPersonalesSeguros();
		Reader read = new Reader();

		System.out.println("\n	Ingresa tu nombre completo");
		datos.setNombre(read.leeString());
		System.out.println("	El nombre es : \n" + datos.getNombre());

		System.out.println("\n	Ingresa tu edad");
		datos.setEdad(read.leeInt());
		System.out.println("	La edad es : \n" + datos.getEdad());

		System.out.println("Deseas agregar una contrasenia S,N");

	}
}