import org.junit.Test;

public class PatronBuilderTest {
	
	@Test
	public void construirMenu1UsandoElPatronBuilder(){
		
	PlatoDeComidaBuilder platoDeComidaBuilder = new Menu1Builder();
	Camarero camarero = new Camarero(platoDeComidaBuilder);
	camarero.construirPlatoDeComida();
	
	PlatoDeComida plato = camarero.getPlatoDeComida();
	System.out.println(plato);
	
	Camarero camarero2 = new Camarero(new Menu2Builder());
	camarero2.construirPlatoDeComida();
	PlatoDeComida plato2 = camarero2.getPlatoDeComida();
	System.out.println(plato2);

	}
}
