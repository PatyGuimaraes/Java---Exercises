package Show;


public class Ingresso {
	
	protected float vlrIngresso;
	
	public void imprimirValor(float valor) {
		valor = this.vlrIngresso;
		System.out.println("Valor do ingresso:" + valor);
	}

	public float getVlrIngresso() {
		return vlrIngresso;
	}

	public void setVlrIngresso(float vlrIngresso) {
		this.vlrIngresso = vlrIngresso;
	}


	

}
