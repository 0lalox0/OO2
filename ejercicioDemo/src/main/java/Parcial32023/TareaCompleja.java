package Parcial32023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class TareaCompleja extends Tarea {
	public TareaCompleja(String nombre, String Descripcion) {
		super(nombre, Descripcion);
		Tareas = new ArrayList<>();
	}
	List<Tarea> Tareas;
	public void agregarTarea(Tarea T) {
		Tareas.add(T);
	}
	public int calcularEstimado() {
		return Tareas.stream().mapToInt(x -> x.calcularEstimado()).sum();
	}
	public double avanceDeTarea() {
		return Tareas.stream().mapToInt(x -> x.getDuracion()).sum()/calcularEstimado();
	}
	public int getDuracion() {
		return Tareas.stream().mapToInt(x -> x.getDuracion()).sum();
	}
	public void IniciarTarea() {
		Tareas.forEach(x -> x.IniciarTarea());
	}
	public void FinalizarTarea() {
		Tareas.forEach(x -> x.FinalizarTarea());
	}
}

