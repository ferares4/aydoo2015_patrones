
public class PlatoDeComida {

	private String bebida;
	private String platoPrincipal;
	private String acompaniamiento;

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getPlatoPrincipal() {
		return platoPrincipal;
	}

	public void setPlatoPrincipal(String platoPrincipal) {
		this.platoPrincipal = platoPrincipal;
	}

	public String getAcompaniamiento() {
		return acompaniamiento;
	}

	public void setAcompaniamiento(String acompaniamiento) {
		this.acompaniamiento = acompaniamiento;
	}

	public String toString() {
		return "Bebida:" + bebida + ", Plato Principal:" + platoPrincipal + ", Acompañamiento:" + acompaniamiento;
	}

}