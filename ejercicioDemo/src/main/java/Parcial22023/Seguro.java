package Parcial22023;

public abstract class  Seguro {
	protected Auto a;
	protected abstract double calcularVida(int edad);
	protected abstract double calcularDanio(int edad);
	protected abstract double calcularDestruccion(int edad);
public double calcularTotal(int edad) {
	return calcularVida(edad) + calcularDanio(edad) + calcularDestruccion(edad);
}
}
