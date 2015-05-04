
public class Menu2 implements PlatoDeComidaBuilder {
	
	private PlatoDeComida platoDeComida;

	@Override
	public void construirBebida() {
		platoDeComida.setBebida("Cerveza");
		
	}

	@Override
	public void construirPlatoPrincipal() {
		platoDeComida.setPlatoPrincipal("Pizza");
		
	}

	@Override
	public void construirAcompaniamiento() {
		platoDeComida.setAcompaniamiento(null);
		
	}

	@Override
	public PlatoDeComida getPlatoDeComida() {
		// TODO Auto-generated method stub
		return platoDeComida;
	}

}
