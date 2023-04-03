
public class Administrador extends Funcionario implements Autenticable {
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setContraseña(String contraseña) {
		 this.util.setContra(contraseña);
		
	}

	@Override
	public boolean iniciarSesion(String contraseña) {
		return this.util.iniciarSesion(contraseña);
		
	}
	
	

}
