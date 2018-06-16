package br.com.camarao.service;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	PopulaBancoRunnable populaBanco;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		Thread thread = new Thread(populaBanco);
		thread.setPriority(1);
		thread.start();
	}
	
	@PostConstruct
	  void started () {
	    TimeZone.setDefault(TimeZone.getTimeZone("GMT-3"));
	  }
}
