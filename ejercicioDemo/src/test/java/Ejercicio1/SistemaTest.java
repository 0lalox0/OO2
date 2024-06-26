package Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	Sistema t;
	Usuario f;
	Tweet twet;
	Usuario l;
	@BeforeEach
	void setUP() {
		t = new Sistema();	
		f = new Usuario("Francopi");
		twet = new Tweet("2asdad");
		l = new Usuario("lalopi");
		t.AgregarUsuario(f);
		t.AgregarUsuario(l);
		f.AgregarTweet(twet);
		l.ReTweetear(twet);
	}
	@Test
    public void testCrearUsuario() {
    	assertEquals(2, t.MostrarUsuarios());
    }
	@Test
	public void testEliminarUsuario() {
		assertEquals(1,l.mostrarPubli());
		t.EliminarUsuario(f);
		assertEquals(1,t.MostrarUsuarios());
		assertEquals(0,l.mostrarPubli());
		
	}
}
