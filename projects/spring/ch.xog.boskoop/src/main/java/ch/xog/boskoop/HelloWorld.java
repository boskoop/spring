package ch.xog.boskoop;

/**
 * Spring bean.
 * 
 * @author buergich
 */
public class HelloWorld {

	private Planet planet;
	
	public void setPlanet(Planet planet) {
		this.planet = planet;
	}
	
	public void printHello() {
		System.out.println("Spring 3: Hello !");
		String planetName = planet.getName();
		System.out.println("I'm from Planet " + planetName);
	}
}
