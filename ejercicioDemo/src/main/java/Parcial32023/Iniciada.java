package Parcial32023;

public class Iniciada implements State{
	public State IniciarTarea(TareaSimple t) {
		return this;
	}
	public State FinalizarTarea(TareaSimple t) {
		t.finalizarTimer();
		return new Finalizada();
	}
    public int tiempoUtilizado(TareaSimple t) {
    	return 0;
    }
}
