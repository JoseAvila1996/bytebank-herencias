
public class SistemaInterno {
	
	private String clave = "AluraCursos";
	
	public boolean autentica(Autenticable gerente){
		boolean puedeiniciarSesiob = gerente.iniciarSesion(this.clave);
		
		if(puedeiniciarSesiob) {
			System.out.println("login Exitoso");
			return true;
		}
		else {
			System.out.println("Login fallido");
			return false;
		}
		
	}

}
