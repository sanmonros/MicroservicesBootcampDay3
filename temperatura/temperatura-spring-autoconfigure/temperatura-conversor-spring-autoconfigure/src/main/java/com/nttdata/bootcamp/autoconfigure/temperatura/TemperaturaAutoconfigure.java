package com.nttdata.bootcamp.autoconfigure.temperatura;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.temperaturaconversor.Conversor;

@Configuration
@ConditionalOnClass(Conversor.class)
@EnableConfigurationProperties(TemperaturaProperties.class)
public class TemperaturaAutoconfigure {

	private final TemperaturaProperties temperaturesP;
	
	public TemperaturaAutoconfigure(TemperaturaProperties temperaturesP) {
		this.temperaturesP=temperaturesP;
		
	}
	@Bean
	public Conversor conversor() {
		return new Conversor(temperaturesP.getSistema().toString());
		
	}

}
