
public class ControlBonificacion {

	private double suma;
	
	public double registroSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual " +this.suma);
		return this.suma;
	}
	
	public double registroSalario(Gerente gerente) {
		this.suma = gerente.getBonificacion() + this.suma;
		System.out.println("Calculo actual " +this.suma);
		return this.suma;
	}
	
	public double registroSalario(Contador contador) {
		this.suma = contador.getBonificacion() + this.suma;
		System.out.println("Calculo actual " +this.suma);
		return this.suma;
	}
}
