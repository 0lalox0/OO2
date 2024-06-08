package Parcial32023;

public abstract class Tarea {
private String Nombre;
private String Descripcion;
public Tarea (String nombre,String Descripcion) {
	Nombre = nombre;
	this.Descripcion = Descripcion;
}
public abstract int calcularEstimado();
public abstract double avanceDeTarea();
protected abstract int getDuracion();
public abstract void IniciarTarea();
public abstract void FinalizarTarea();
}
