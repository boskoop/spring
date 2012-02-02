/**
 * 
 */
package ch.xog.boskoop;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author buergich
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {

	@InjectMocks
	private HelloWorld hello = new HelloWorld();
	
	@Mock
	private Planet planet;

	/**
	 * Test method for {@link ch.xog.boskoop.HelloWorld#printHello()}.
	 */
	@Test
	public void testPrintHello() {
		when(planet.getName()).thenReturn("Mock");
		hello.printHello();
		Mockito.verify(planet, times(1)).getName();
	}

}
