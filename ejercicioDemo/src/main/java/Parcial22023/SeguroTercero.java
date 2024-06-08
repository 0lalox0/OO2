package Parcial22023;

public class SeguroTercero extends Seguro{
	protected double calcularVida(int edad) {
		return 100 * edad;
	}
	protected double calcularDanio(int edad) {
		return 1000 + 0.01 * a.getValor(); 
	}
	protected double calcularDestruccion(int edad) {
		return 0.5 * a.getValor();
	}
}
