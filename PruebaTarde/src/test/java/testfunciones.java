import static org.junit.Assert.*;

import org.junit.Test;

public class testfunciones {

	@Test
	public void testSuma() {
		int resultado;
		Funciones funciones=new Funciones();
		
		resultado=funciones.suma(3, 7);
		
		assertEquals(resultado,10);
	}

}
