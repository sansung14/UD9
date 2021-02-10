package ejercicio1;

public class Television extends Electrodomestico {
	private int resolucion;
	private boolean sintonizador;
	
	public Television() {
		this.resolucion=20;
		this.sintonizador=false;
	}
	
	public Television(double precio_base, int peso) {
		super(precio_base, peso);
		this.resolucion=20;
		this.sintonizador=false;
	}
	
	
	public Television(String color, char consumo, double precio_base, int peso, int resolucion, boolean sintonizador) {
		super(color, consumo, precio_base, peso);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	}
	
	
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	
	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	
	
	public boolean isSintonizador() {
		return sintonizador;
	}
	
	
	@Override
	public double precioFinal() {
		double pfinal=super.precioFinal();
		if(this.resolucion>40) {
			pfinal=pfinal*1.30;
		}
		if(this.sintonizador==true) {
			pfinal=pfinal+50;
		}
		
		return pfinal;
	}
	
}
