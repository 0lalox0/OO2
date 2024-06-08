package Parcial32023;

public class Finalizada implements State{
	public State IniciarTarea(TareaSimple t) {
		return this;
	}
	public State FinalizarTarea(TareaSimple t) {
		return this;
	}
    public int tiempoUtilizado(TareaSimple t) {
    	return t.getDuracionReal();
    }
}
