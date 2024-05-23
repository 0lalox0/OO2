package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
private String Nombre;
private List<Publicacion> publicaciones;
public Usuario(String nombre) {
	Nombre = nombre;
	publicaciones = new ArrayList();
}
public void AgregarTweet(Tweet tweet) {
	publicaciones.add(tweet);
}
public void ReTweetear(Publicacion origen) {
	ReTweet reTweet = new ReTweet(origen);
	publicaciones.add(reTweet);
}
public void eliminarRetweets(List<Publicacion> tweetsAjenos) {
	List<Publicacion> publicacionesAEliminar = new ArrayList<>();
	publicaciones.forEach(t -> {
		tweetsAjenos.forEach(r -> {
			if(t.SoyDe(r)) {	
				publicacionesAEliminar.add(t);
			}	
		});	
	});
	publicaciones.removeAll(publicacionesAEliminar);
}
public void eliminame() {
	publicaciones = null;
}
public List<Publicacion> getPublicaciones(){
	return publicaciones;
}
public int mostrarPubli() {
	return publicaciones.size();
}
}
