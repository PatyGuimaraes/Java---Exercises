package Show;

public class CamaroteInferior extends ClasseVip {
	
	private String localizacaoIngresso;

	public String getLocalIngresso() {
		return localizacaoIngresso;
	}

	public void setLocalIngresso(String localIngresso) {
		this.localizacaoIngresso = localIngresso;
	}
	
	public String acessaLocalizacao() {
		return this.localizacaoIngresso;
	}
	
	public void imprimeLocalizacao(String local) {
		this.localizacaoIngresso = local;
		System.out.println("Local: " + local);
		
	}

}
