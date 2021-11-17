package Principal;

import Show.CamaroteInferior;
import Show.CamaroteSuperior;
import Show.ClasseVip;
import Show.Ingresso;
import Show.Normal;

public class Principal {

	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso ();
		Normal ingressoN = new Normal();
		ClasseVip ingressoVip = new ClasseVip();
		CamaroteInferior camaroteInferior = new CamaroteInferior();
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
		
		ingresso.setVlrIngresso(100);
		
		ingressoN.setVlrIngresso(50);
		ingressoN.imprimirIngressoNormal(ingressoN.getVlrIngresso());
		
		ingressoVip.setValorAdicional(70);
		System.out.println("Ingresso VIP: " + ingressoVip.valorIngressoVip(ingresso.getVlrIngresso()));
		
		camaroteInferior.setLocalIngresso("Pista");
		camaroteInferior.imprimeLocalizacao(camaroteInferior.getLocalIngresso());
		
		camaroteSuperior.setValorAdicional(150);
		camaroteSuperior.setVlrIngresso(50);
		System.out.println("Valor ingresso Camarote Superior: " + camaroteSuperior.valorIngressoSuperior(ingressoVip.getValorAdicional()));
		
		

	}

}
