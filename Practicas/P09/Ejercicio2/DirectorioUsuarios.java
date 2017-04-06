public class DirectorioUsuarios {
	private Usuario [] listaDeUsuarios;
	private int noUsuarios;

	public DirectorioUsuarios() {
		this.noUsuarios = 0;
		this.listaDeUsuarios = new Usuario[noUsuarios];
	}

	public void registrarUsuario() {
		int dia, mes, anio;

		StringReader reader = new StringReader();
		IntReader reader1 = new IntReader();
		LongReader reader2 = new LongReader();

		System.out.println("  Cuantos usuarios va a registrar ");
		noUsuarios = reader1.leeInt();
		Usuario listaDeUsuarios[] = new Usuario[noUsuarios];
		for (int i = 0; i < listaDeUsuarios.length; i++) {
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

			listaDeUsuarios[i] = usuarios;
		}

		for (int i = 0; i < listaDeUsuarios.length; i++) {
			System.out.println(listaDeUsuarios[i]);
		}

	}

	public boolean iniciarSesion(String logNicknamme, String logPassword) {
		boolean cookie = false;
		for (int i = 0; i < listaDeUsuarios.length; i++) 			
		if ( listaDeUsuarios[i].getNickname().equals(logNicknamme) && listaDeUsuarios[i].getContrasenia().equals(logPassword)){
				return cookie = true;
		}else{
      	  return cookie;
      	}	
		
		return cookie;
	}
}