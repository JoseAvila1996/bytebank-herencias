
public class Gerente extends Funcionario implements Autenticable{
	private String contraseña = "AluraCurso";
	
	public double getBonificacion() {
		return super.getSalario() + 0.05;
	}

	@Override
	public void setContraseña(String contraseña) {
		contraseña = this.contraseña;
		
	}

	@Override
	public boolean iniciarSesion(String contraseña) {
		contraseña = this.contraseña;
		if(contraseña==this.contraseña) {
			return true;
		}
		return false;
		
	}
	
}
