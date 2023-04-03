
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public boolean saca(double valor) {
		
		return super.saca(valor);
	}
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}
	

}
