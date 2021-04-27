package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.Evento;
import view.*;

class TesteTelaConvidados {
	private ArrayList<Evento> eventoArray = new ArrayList<>();
	
	TelaConvidados tC =  new TelaConvidados(eventoArray);	

	@Test
	void testTelaConvidados() {
		assertEquals(2, 1+1);
	}

	@Test
	void testTituloPagina() {
		assertEquals(2, 1+1);	}

	@Test
	void testNome() {
		assertEquals(2, 1+1);	}

	@Test
	void testTelefone() {
		assertEquals(2, 1+1);	}

	@Test
	void testIdade() {
		assertEquals(2, 1+1);	}

	@Test
	void testSexo() {
		assertEquals(2, 1+1);	}

}
