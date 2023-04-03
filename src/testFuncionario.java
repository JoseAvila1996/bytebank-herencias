
public class testFuncionario {
	public static void main(String[] args) {
		
		Funcionario luis = new Contador();
		luis.setNombre("Luis");
		luis.setDocumento("44556677");
		luis.setSalario(2000);
		
		System.out.println(luis.getBonificacion());
		System.out.println(luis.getNombre());
	}
	
	

}
