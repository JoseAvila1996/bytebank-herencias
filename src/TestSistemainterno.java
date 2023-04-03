
public class TestSistemainterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador admin = new Administrador();
		
		gerente.setContraseña("AluraCurso");
		sistema.autentica(gerente);
		sistema.autentica(admin);
	
}
}
