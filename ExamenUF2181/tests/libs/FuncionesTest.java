package libs;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesTest {

	private static Funciones f;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		f = new Funciones();
		System.out.println("Iniciando tests...");
	}


	
	@Test
	void devuelveCentralTest() {
		
		assertEquals(5, f.devuelveCentral(1,5,9));
		assertNotEquals(1, f.devuelveCentral(1,5,9));
		assertNotEquals(9, f.devuelveCentral(1,5,9));
		
		assertEquals(6, f.devuelveCentral(6,1,12));
		assertNotEquals(1, f.devuelveCentral(6,1,12));
		assertNotEquals(12, f.devuelveCentral(6,1,12));
		
		assertEquals(13, f.devuelveCentral(15,12,13));
		assertNotEquals(12, f.devuelveCentral(15,12,13));
		assertNotEquals(15, f.devuelveCentral(15,12,13));
		
	}
	
	
	@Test
	void esBisiestoTest() {
		assertTrue(f.esBisiesto(2000));
		assertFalse(f.esBisiesto(2023));
	}
	
	@Test
	void esCapicuaTest() {
		int v[] = {3,5,6,5,3};
		int v2[] = {3,2,6,5,3};
		assertTrue(f.esCapicua(v));
		assertFalse(f.esCapicua(v2));
	}
	
	@Test
	void sumaVectoresTest() {
		int v[] = {1,2,3};
		int v2[] = {4,6,8};
		int suma[] = {5,8,11};
		
		int v3[] = {4,6,8,4};
		
		
		assertArrayEquals(suma, f.suma_vectores(v, v2));
		assertThrows(ArithmeticException.class, ()-> f.suma_vectores(v, v3));
	}

}
