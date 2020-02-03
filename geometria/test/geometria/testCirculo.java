package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class testCirculo {
	private double re;
	 private double AreaR;
	 private double PerimetroR;

	 public testCirculo(double radio,double resultadoPerimetro, double resultadoArea) {
	  re=radio;
	  AreaR = resultadoArea;
	  PerimetroR = resultadoPerimetro;
	 }

	 
	 @Parameters
	 public static Collection<Object[]> numeros(){
	  return Arrays.asList(new Object[][] {
	   {7,153.9384,43.9824},{0,0,0},{-3,28.2744,18.8496}
	  });

	 }
	@Test
	public void testArea() {
		Circulo_FJRS circulo = new Circulo_FJRS(re,"test");
		double res = circulo.area();
		assertEquals(AreaR,res,0.01);
	}

	@Test
	public void testPerimetro() {
		Circulo_FJRS circulo = new Circulo_FJRS(re,"test");
		double res = circulo.perimetro();
		assertEquals(PerimetroR,res,0);
	}

}