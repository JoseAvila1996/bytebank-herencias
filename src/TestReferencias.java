
public class TestReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Contador();
		funcionario.setNombre("pepe");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("lila");
		
		funcionario.setSalario(2000);
		funcionario.getSalario();
		
		

	}

}
