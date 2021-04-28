package testes;

import static org.junit.jupiter.api.Assertions.*;
import testes.Validador;

import org.junit.jupiter.api.Test;

class TesteValidador {
	Validador v = new Validador();
		
	@Test
	void testValidaHorario() {
		assertTrue(v.validaHorario(24));
		assertTrue(v.validaHorario(01));
		assertFalse(v.validaHorario(-5));
		assertFalse(v.validaHorario(25));
	}

	@Test
	void testValidaData() {
		assertTrue(v.validaData("01/01/2021"));
		assertTrue(v.validaData("07/12/2022"));
		assertTrue(v.validaData("31/12/2021"));
		assertTrue(v.validaData("01/01/2021"));
		assertFalse(v.validaData("33/02/2029"));
		assertFalse(v.validaData("02/13/2029"));
		assertFalse(v.validaData("03/04/2019"));
	}
	
	@Test
	void testValidaNome() {
		assertTrue(v.validaNome("Lameque Fernandes"));
		assertTrue(v.validaNome("Marquinhos"));
		assertFalse(v.validaNome("Mariaj0aquinh4"));
		assertFalse(v.validaNome("Ciril0"));
	}

}
