package ar.edu.pattern.domain;

public class LED extends TV {

	private double tiempoRespuesta;

	public LED() {
		setDescripcion("LED");
	}

	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

}