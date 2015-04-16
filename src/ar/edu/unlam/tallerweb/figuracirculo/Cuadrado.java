package ar.edu.unlam.tallerweb.figuracirculo;

public class Cuadrado extends Figura {

	private Double lado = 0.0;
	
	public Cuadrado (Double lado){
		this.lado = lado;
	}
	
	
	@Override
	public Double obtenerArea() {

		area=Math.pow(lado, 2);
		return area;
	}

	@Override
	public Double obtenerPerimetro() {
		perimetro = lado*4;
		return perimetro;
	}

}
