package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Usuario> usuarios;
	public Sistema() {
		usuarios =  new ArrayList<Usuario>() ;
	}
	public Sistema(List<Usuario> users) {
		usuarios = users;
	}
	public void AgregarUsuario(Usuario user) {
		usuarios.add(user);
	}
	public void EliminarUsuario(Usuario user) {
		usuarios.forEach(t -> t.eliminarRetweets(user.getPublicaciones()));
		user.eliminame();
		usuarios.remove(user);
	}
	public int MostrarUsuarios() {
		return usuarios.size();
	}
}
