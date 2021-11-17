package Show;


public class ClasseVip extends Ingresso {
	
	private float valorAdicional = 50;

	
	/*public ClasseVip() {
	
	}
	
	public ClasseVip(float valorAdicional) {
		this.valorAdicional = valorAdicional;
		this.totalIngVip = 0;
	}*/

	public float valorIngressoVip(float valoringresso) {
		super.vlrIngresso = valoringresso;
		return super.getVlrIngresso() + this.valorAdicional ;
	}


	public float getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	



}
