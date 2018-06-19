package br.com.camarao.service;

import java.time.LocalDateTime;

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
			LocalDateTime l = (LocalDateTime.now());
			Camarao camarao = new Camarao(s.simularSalinidade(), s.simularSalinidade(), s.simularTemperatura(),
					s.simularTransparencia(), s.simularMateriaOrganica(), s.simularOxigenioDissolvido(), s.simularPh(),
					s.simularAlcalinidadeDoce(), s.simularAlcalinidadeSalobra(), s.simularDurezaDoce(), s.simularDurezaSalobra(),
					s.simularAmonia(), s.simularNitritoDoce(), s.simularNitritoSalobra(), s.simularNitratoDoce(),
					s.simularNitratoSalobra(), s.simularH2s(), s.simularSilicato(), l);
			camaroes.save(camarao);
			try {
				Thread.sleep(1000*30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }


}
