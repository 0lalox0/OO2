package Ejercicio1;

public class Main {
public static void main(String[] args) {
		System.out.println("lalo");
		Sistema t = new Sistema();
		
		
		Usuario f = new Usuario("Francopi");
		
		Tweet twet = new Tweet("2asdad");
		
		Usuario l = new Usuario("lalopi");
		
		t.AgregarUsuario(f);
		t.AgregarUsuario(l);
		
		f.AgregarTweet(twet);
		
		
		l.ReTweetear(twet);
		
		l.mostrarPubli();
		
		t.EliminarUsuario(f);
		t.MostrarUsuarios();
		l.mostrarPubli();
		
		
	}
}