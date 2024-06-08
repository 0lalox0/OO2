package Parcial32023;

public interface State {
	public State IniciarTarea(TareaSimple t);
	public State FinalizarTarea(TareaSimple t);
	public int tiempoUtilizado(TareaSimple t);
}
