package com.nttdata.bootcamp.autoconfigure.temperatura;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.nttdata.bootcamp.temperaturaconversor.ConversorEnum;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("temperatura.conversor")
@Getter
@Setter
public class TemperaturaProperties {

	private ConversorEnum sistema;
	

}
