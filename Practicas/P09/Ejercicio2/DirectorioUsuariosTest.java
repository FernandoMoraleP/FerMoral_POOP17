public class DirectorioUsuariosTest{
	public static void main(String[] args) {
		DirectorioUsuarios usuarios = new DirectorioUsuarios();
		Usuario [] listaDeUsuarios = new Usuario[0];
		usuarios.registrarUsuario();

		StringReader reader = new StringReader();
		System.out.println("Debe iniciar secion");
		String logNickname;
		String logPassword;

		System.out.println("Usuario: ");
      	logNickname = reader.leeString();

      	System.out.println("Contraseña: ");
      	logPassword = reader.leeString();

      
      	boolean cookie = usuarios.iniciarSesion(logNickname, logPassword);

      	if (cookie == true){
      	  System.out.println("Sesion Iniciada");
      	}else{
      	  System.out.println("Sesion NO iniciada");
      	}
	}
}