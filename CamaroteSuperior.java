package Show;

public class CamaroteSuperior extends ClasseVip {
	
	private float valorAdicional;
	
	public float valorIngressoSuperior(float valor) {
		this.valorAdicional = valor;
		float valorAdd = (this.valorAdicional + super.vlrIngresso) + super.vlrIngresso;
		return valorAdd;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	

}
