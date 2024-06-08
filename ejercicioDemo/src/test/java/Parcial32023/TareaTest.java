package Parcial32023;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TareaTest {
	TareaCompleja T1;
	TareaSimple T2;
	TareaCompleja T3;
	TareaSimple T4;
	@BeforeEach
	void SetUp() {
		T1 = new TareaCompleja("Cortar Pasto","10000peso");
		T2 = new TareaSimple("Comprar cortadora","as",2);
		T3 = new TareaCompleja("sacar yuyo","pala");
		T4 = new TareaSimple("Comprar cortadora","as",2);
		T1.agregarTarea(T2);
		T3.agregarTarea(T4);
		T1.agregarTarea(T3);
	}
	@Test
	public void TestAvance(){
		assertEquals(0,T1.avanceDeTarea());
		T1.IniciarTarea();
		assertEquals(0,T2.avanceDeTarea());
		assertEquals(0,T1.avanceDeTarea());
		T1.FinalizarTarea();
		assertEquals((5/2),T2.avanceDeTarea());
		assertEquals(2,T1.avanceDeTarea());

	} 
	
}
