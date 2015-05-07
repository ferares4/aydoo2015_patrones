
public class Menu2Builder implements PlatoDeComidaBuilder {
	
	private PlatoDeComida platoDeComida;
	
	public Menu2Builder(){
		
		platoDeComida = new PlatoDeComida();
		
	}

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
