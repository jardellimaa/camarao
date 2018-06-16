package br.com.camarao.service;

import java.util.Random;

public class Simulacao {

	Random r = new Random();

	public float simularSalinidade() {
		return (float) ((float) (r.nextFloat() * 39.5)+0.5);
	}
	
	public float simularTemperatura() {
		return (float) ((float) (r.nextFloat() * 7)+26);
	}
	
	public float simularTransparencia() {
		return (float) ((float) (r.nextFloat() * 20)+20);
	}
	
	public float simularMateriaOrganica() {
		return (float) ((float) (r.nextFloat() * 9)+1);
	}
	
	public float simularOxigenioDissolvido() {
		return (float) ((float) (r.nextFloat() * 2.5)+4);
	}
	
	public float simularPh() {
		return (float) ((float) (r.nextFloat() * 1.3)+7.5);
	}
	
	public float simularAlcalinidadeDoce() {
		return (float) ((float) (r.nextFloat() * 80)+100);
	}
	
	public float simularAlcalinidadeSalobra() {
		return (float) ((float) (r.nextFloat() * 100)+120);
	}
	
	public float simularDurezaDoce() {
		return (float) ((float) (r.nextFloat() * 150)+100);
	}
	
	public float simularDurezaSalobra() {
		return (float) ((float) (r.nextFloat() * 1250)+1000);
	}
	
	public float simularAmonia() {
		return (float) ((float) (r.nextFloat() * 0.9)+0.1);
	}
	
	public float simularNitritoDoce() {
		return (float) ((float) (r.nextFloat() * 0.5));
	}
	
	public float simularNitritoSalobra() {
		return (float) ((float) (r.nextFloat() * 5.9)+0.1);
	}
	
	public float simularNitratoDoce() {
		return (float) ((float) (r.nextFloat() * 5));
	}
	
	public float simularNitratoSalobra() {
		return (float) ((float) (r.nextFloat() * 10));
	}
	
	public float simularH2s() {
		return (float) ((float) (r.nextFloat() * 0.01));
	}
	
	public float simularSilicato() {
		return (float) ((float) (r.nextFloat() * 10)+1);
	}

}
