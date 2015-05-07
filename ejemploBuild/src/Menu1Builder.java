
public class Menu1Builder implements PlatoDeComidaBuilder{
	
	private PlatoDeComida platoDeComida;
	
	public Menu1Builder(){
		
		platoDeComida = new PlatoDeComida();
		
	}

	@Override
	public void construirBebida() {
		platoDeComida.setBebida("CocaCola");
		
	}

	@Override
	public void construirPlatoPrincipal() {
		platoDeComida.setPlatoPrincipal("Bife De Chorizo");
		
	}

	@Override
	public void construirAcompaniamiento() {
		platoDeComida.setAcompaniamiento("Papas Fritas");
		
	}

	@Override
	public PlatoDeComida getPlatoDeComida() {
		return platoDeComida;
	}

}
