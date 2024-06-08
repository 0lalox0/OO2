package Parcial22023;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Cliente {
	private int edad;
	private List<Seguro> seguros;
	private Promocion promo;
	public Cliente(int e) {
		edad = e;
		seguros = new ArrayList<>();
	}
	public void agregarSeguro(Seguro s) {
		seguros.add(s);
	}
	public double calcularTotalSinPromo() {
		return seguros.stream().mapToDouble(x -> x.calcularTotal(edad)).sum();
	}
	public double calcularTotal() {
		return seguros.stream().mapToDouble(x -> x.calcularTotal(edad)).sum() - promo.calcularPromo(this);
	}
	public OptionalDouble devolverMenor() {
		return seguros.stream().mapToDouble(x -> x.calcularTotal(edad)).min();
	}
	public double getSegurosSize() {
		return seguros.size();
	}
}
