package Parcial32023;

public class TareaSimple extends Tarea{
	public TareaSimple(String nombre, String Descripcion,int duracion) {
		super(nombre, Descripcion);
		duracionEstimada = duracion;
		estado = new SinIniciar();
	}
	private int inicio;
	private int fin;
	private int duracionEstimada;
	private State estado;
	public int calcularEstimado() {
		return duracionEstimada;
	}
	public double avanceDeTarea() {
		return getDuracion()/duracionEstimada;
	}
	public int getDuracion() {
		return estado.tiempoUtilizado(this);
	}
	public int getDuracionReal() {
		return (fin-inicio);
	}
	public void IniciarTarea() {
		this.estado = estado.IniciarTarea(this);
	}
	public void FinalizarTarea() {
		this.estado = estado.FinalizarTarea(this);
	}
	public void iniciarTimer() {
		inicio = 0;
	}
	public void finalizarTimer() {
		fin = 5;
	}
}
