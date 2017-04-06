public class UsuarioTest {
	public static void main(String[] args) {
		int numero = 0;
		int dia, mes, anio;

		StringReader reader = new StringReader();
		IntReader reader1 = new IntReader();
		LongReader reader2 = new LongReader();

		System.out.println("  Cuantos usuarios va a registrar ");
		numero = reader1.leeInt();
		Usuario arrayUsuario[]  = new Usuario [numero];

		for (int i=0; i < arrayUsuario.length; i++) {
			Usuario usuarios = new Usuario();
			
			System.out.println("  Ingrese el nombre de usuario: ");
			usuarios.setNombre(reader.leeString());

			System.out.println("  Ingrese el nickname de usuario: ");
			usuarios.setNickname(reader.leeString());

			System.out.println("  Ingrese la contrasenia de usuario: ");
			usuarios.setContrasenia(reader.leeString());

			System.out.println("  Ingrese la direccion de usuario: ");
			usuarios.setDireccion(reader.leeString());

			System.out.println("  Ingrese el mail de usuario: ");
			usuarios.setMail(reader.leeString());

			System.out.println("  Ingrese el numero telefonico de usuario: ");
			usuarios.setTelefono(reader2.leeLong());

			System.out.println("  Ingrese la fecha de nacimiento: ");
			System.out.println("Proporciona el dia: ");
			dia = reader1.leeInt();

			System.out.println("Proporciona el mes: ");
			mes = reader1.leeInt();

			System.out.println("Proporciona el anio: ");
			anio = reader1.leeInt();

			usuarios.getFechaNacimiento().asignarFecha(dia, mes, anio);

			arrayUsuario[i] = usuarios;
		}

		for (int i=0; i < arrayUsuario.length; i++) {
			System.out.println(arrayUsuario[i]);
		}
	}
}