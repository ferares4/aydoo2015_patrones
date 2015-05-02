package ar.edu.pattern.domain;

public class LCD extends TV {

	private double cantidadLiquido;

	public LCD() {
		setDescripcion("LCD");
	}

	public double getCantidadLiquido() {
		return cantidadLiquido;
	}

	public void setCantidadLiquido(double cantidadLiquido) {
		this.cantidadLiquido = cantidadLiquido;
	}

}