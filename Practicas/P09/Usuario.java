public class Usuario {
	private String nombre;
	private String nickname;
	private String direccion;
	private String mail;
	private Long telefono;
	private Fecha fechaNacimiento;

	public Usuario() {
		this.fechaNacimiento = new Fecha();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String inombre) {
        nombre = inombre;
    }

    public String getNickname() {
    	return nickname;
    }

    public void setNickname(String inickname) {
    	nickname = inickname;
    }

    public String getDireccion() {
    	return direccion;
    }

    public void setDireccion(String idireccion) {
    	direccion = idireccion;
    }

    public String getMail() {
    	return mail;
    }

    public void setMail(String imail) {
        mail = imail;
    }    

    public Long getTelefono() {
    	return telefono;
    }

    public void setTelefono(Long itelefono) {
    	telefono = itelefono;
    }    

    public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String toString() {
		return "\n  El nombre es: \n\t" + nombre
		+ "  \n  El nickname es: \n\t" + nickname
		+ "  \n  La direccion es: \n\t" + direccion
		+ "  \n  El mail es: \n\t" + mail
		+ "  \n  El numero telefonico es: \n\t" + telefono
		+ "  \n  La fecha de nacimiento es: \n\t" + fechaNacimiento;
	}

}