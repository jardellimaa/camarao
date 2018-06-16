package br.com.camarao.service;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.camarao.model.Camarao;
import br.com.camarao.repository.Camaroes;

@Component
public class PopulaBancoRunnable implements Runnable {

	@Autowired
    private Camaroes camaroes;
	
	Simulacao s = new Simulacao();

    public void run() {
    	while (true) {
			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT-6"));
			Camarao camarao = new Camarao(s.simularSalinidade(), s.simularSalinidade(), s.simularTemperatura(),
					s.simularTransparencia(), s.simularMateriaOrganica(), s.simularOxigenioDissolvido(), s.simularPh(),
					s.simularAlcalinidadeDoce(), s.simularAlcalinidadeSalobra(), s.simularDurezaDoce(), s.simularDurezaSalobra(),
					s.simularAmonia(), s.simularNitritoDoce(), s.simularNitritoSalobra(), s.simularNitratoDoce(),
					s.simularNitratoSalobra(), s.simularH2s(), s.simularSilicato(), c);
			System.out.println(camarao);
			camaroes.save(camarao);
			try {
				Thread.sleep(1000*60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }


}
