package com.nttdata.bootcamp.temperaturaconversor;

public class Conversor {

	
	private ConversorEnum sistema;

	public Conversor(String sistema) {
        this.sistema = ConversorEnum.valueOf(sistema.toUpperCase());
    }

	public Conversor() {
		this.sistema = ConversorEnum.CELSIUS;
	}

	public double convert(String degrees) {
		Double degreesD = Double.parseDouble(degrees);
		double result;
		if (sistema.equals(ConversorEnum.FARENHEIT)) {
			result = (degreesD - 32) / 1.8;
		} else {
			result = (degreesD * 1.8) + 32;
		}
		return result;
	}
	
}
