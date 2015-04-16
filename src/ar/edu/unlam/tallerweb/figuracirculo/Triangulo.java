package ar.edu.unlam.tallerweb.figuracirculo;

public class Triangulo extends Figura {

	private Double a = 0.0;
	private Double b = 0.0;
	private Double c = 0.0;
	private Double sp = 0.0;
	
	public Triangulo(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public Double obtenerArea() {
		this.sp = (a+b+c)/2;
		area= Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c)) ;
		return area;
	}

	@Override
	public Double obtenerPerimetro() {
		perimetro = this.a+this.b+this.c;
		return perimetro;
	}

}
