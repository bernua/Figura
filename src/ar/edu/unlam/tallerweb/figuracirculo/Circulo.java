package ar.edu.unlam.tallerweb.figuracirculo;

public class Circulo extends Figura {
	
	private Double radio = 0.0;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	@Override
	public Double obtenerPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radio;
	}

	@Override
	public Double obtenerArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.radio, 2);
	}
	
}
