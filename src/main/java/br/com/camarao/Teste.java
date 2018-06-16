package br.com.camarao;

import br.com.camarao.service.Simulacao;

public class Teste {

	public static void main(String[] args) {
		
		Simulacao s = new Simulacao();
		
		System.out.println(s.simularSalinidade());
		System.out.println(s.simularTemperatura());
		System.out.println(s.simularTransparencia());
		System.out.println(s.simularMateriaOrganica());
		System.out.println(s.simularOxigenioDissolvido());
		System.out.println(s.simularPh());
		System.out.println(s.simularAlcalinidadeDoce());
		System.out.println(s.simularAlcalinidadeSalobra());
		System.out.println(s.simularDurezaDoce());
		System.out.println(s.simularDurezaSalobra());
		System.out.println(s.simularAmonia());
		System.out.println(s.simularNitritoDoce());
		System.out.println(s.simularNitritoSalobra());
		System.out.println(s.simularNitratoDoce());
		System.out.println(s.simularNitratoSalobra());
		System.out.println(s.simularH2s());
		System.out.println(s.simularSilicato());
		
	}

}
