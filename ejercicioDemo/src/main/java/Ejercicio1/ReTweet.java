package Ejercicio1;

public class ReTweet extends Publicacion{
	private Publicacion origen;

	public ReTweet(Publicacion origen) {
		this.origen = origen;
	}
	public boolean SoyDe(Publicacion publi) {
		return origen == publi;
	}
}
