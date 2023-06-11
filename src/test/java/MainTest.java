import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MainTest {
/*
	@Test
	public void test01() {
		int numero1 = 1;
		int numero2 = 10;
		
		List<Integer> valorEsperado =  Arrays.asList(2,4,6,8);
		List<Integer> valorObtenido = Main.numeros(numero1, numero2);
		assertEquals(valorEsperado, valorObtenido);	
	}*/
	@Test
	public void test02() {
		int numero1 = 1;
		int numero2 = 10;
		
		List<Integer> valorEsperado =  Arrays.asList(3,5,7,9);
		List<Integer> valorObtenido = Main.numeros(numero1, numero2);
		assertEquals(valorEsperado, valorObtenido);	
	}	
}
