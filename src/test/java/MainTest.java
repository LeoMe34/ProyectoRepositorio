import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MainTest {

	@Test
	public void test01() {
		int numero1 = 1;
		int numero2 = 8;
		
		List<Integer> valorEsperado =  Arrays.asList(2,3,4,5,6,7);
		List<Integer> valorObtenido = Main.numeros(numero1, numero2);
		assertEquals(valorEsperado, valorObtenido);	
	}
}
