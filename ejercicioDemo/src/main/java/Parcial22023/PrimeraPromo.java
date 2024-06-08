package Parcial22023;

public class PrimeraPromo implements Promocion{
	public double calcularPromo(Cliente c) {
		if(c.getSegurosSize() > 1) {
			return c.calcularTotalSinPromo() * 0.1;
		}else {
			return 0;
		}
	}

}
