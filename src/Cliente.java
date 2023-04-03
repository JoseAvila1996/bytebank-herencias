public class Cliente implements Autenticable{

    private String nombre;
    private String numeroIdentidad;
    private String profesion;
    private String contraseña;

    private AutenticacionUtil util;
    
    public Cliente() {
    	this.util = new AutenticacionUtil();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }
    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
	@Override
	public void setContraseña(String contraseña) {
		contraseña = this.contraseña;
		
	}
	@Override
	public boolean iniciarSesion(String contraseña) {
		return this.util.iniciarSesion(contraseña);
	
	}

}