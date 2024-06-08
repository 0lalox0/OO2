package Parcial32023;

public class SinIniciar implements State{
	public State IniciarTarea(TareaSimple t) {
		t.iniciarTimer();
		return new Iniciada();
	}
	public State FinalizarTarea(TareaSimple t) {
		return this;
	}
    public int tiempoUtilizado(TareaSimple t) {
    	return 0;
    }
}
