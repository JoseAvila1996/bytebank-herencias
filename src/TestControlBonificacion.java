
public class TestControlBonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario arath = new Contador();
		arath.setSalario(2000);
		
		Gerente darexi = new Gerente();
		darexi.setSalario(10000);
		
		Contador ale = new Contador();
		ale.setSalario(10000);
		
		ControlBonificacion controlBonificacion  = new ControlBonificacion();
		controlBonificacion.registroSalario(arath);
		controlBonificacion.registroSalario(darexi);
		controlBonificacion.registroSalario(ale);

	}

}
