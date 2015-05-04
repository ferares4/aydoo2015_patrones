
public class Menu1 implements PlatoDeComidaBuilder{
	
	private PlatoDeComida platoDeComida;

	@Override
	public void construirBebida() {
		platoDeComida.setBebida("Coca-Cola");
		
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
