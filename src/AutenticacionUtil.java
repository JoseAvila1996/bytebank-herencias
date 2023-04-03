
public class AutenticacionUtil {

	private String contraseña;
	
	public boolean iniciarSesion(String contraseña) {
		if(contraseña==this.contraseña) {
			return true;
		}
		return false;
	}
	public void setContra(String contra) {
		this.contraseña = contra;
	}
}
