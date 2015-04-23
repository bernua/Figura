package ar.edu.unlam.tallerweb.figuracirculotest;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.figuracirculo.Circulo;
import ar.edu.unlam.tallerweb.figuracirculo.Cuadrado;
import ar.edu.unlam.tallerweb.figuracirculo.Triangulo;
public class TestFiguras {


		@Test
		public void testAreaTriangulo() {
			Triangulo triangulo = new Triangulo(2.0, 3.0, 4.0);
			Assert.assertEquals(2.9, triangulo.obtenerArea(), 0.1);
		}

		@Test
		public void testPerimetroTriangulo() {
			Triangulo triangulo = new Triangulo(2.0, 3.0, 4.0);
			Assert.assertEquals(9.0, triangulo.obtenerPerimetro(), 0.1);
		}
		
		@Test
		public void testAreaCuadrado() {
			Cuadrado miCuadrado = new Cuadrado(1.2);
			Assert.assertEquals(1.44, miCuadrado.obtenerArea(), 0.1);
		}

		@Test
		public void testPerimetroCuadrado() {
			Cuadrado cuadrado = new Cuadrado(1.2);
			Assert.assertEquals(4.8, cuadrado.obtenerPerimetro(), 0.1);
		}
		
		
		@Test
		public void testAreaCirculo() {
			Circulo miCirculo = new Circulo(1.2);
			Assert.assertEquals(4.52, miCirculo.obtenerArea(), 0.1);
		}

		@Test
		public void testPerimetroCirculo() {
			Circulo miCirculo = new Circulo(1.2);
			Assert.assertEquals(7.54, miCirculo.obtenerPerimetro(), 0.1);
		}
		
		
	}