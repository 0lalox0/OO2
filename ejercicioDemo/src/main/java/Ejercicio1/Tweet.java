package Ejercicio1;

public class Tweet extends Publicacion {
	private String texto;
	public Tweet(String text) {
		if(text.length() <= 280)
			texto = text;
	}
}
