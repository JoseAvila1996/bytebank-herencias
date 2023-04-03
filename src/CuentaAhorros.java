
public class CuentaAhorros extends Cuenta{

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
	

}
