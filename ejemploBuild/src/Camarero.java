
public class Camarero {
	
	private PlatoDeComidaBuilder platoDeComidaBuilder;

	public Camarero(PlatoDeComidaBuilder platoDeComidaBuilder){
		
		this.platoDeComidaBuilder = platoDeComidaBuilder;
		
	}
	
	public void construirPlatoDeComida(){
		
		platoDeComidaBuilder.construirBebida();
		platoDeComidaBuilder.construirPlatoPrincipal();
		platoDeComidaBuilder.construirAcompaniamiento();
		
	}
	
	public PlatoDeComida getPlatoDeComida(){
		
		return platoDeComidaBuilder.getPlatoDeComida();
		
	}

}
