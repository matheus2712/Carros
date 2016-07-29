import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarro {

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.potencia = 20;
		c.acelerar();
		c.acelerar();
		assertEquals(40, c.velocidade);
	}

}
