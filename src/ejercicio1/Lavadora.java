package ejercicio1;


public class Lavadora extends Electrodomestico {
	private final int CARGA_DEF = 5;
	private int carga;
	
	public Lavadora() {
		this.carga=CARGA_DEF;
	}
	
	public Lavadora(Double  precio_base, int peso) {
		super(precio_base, peso);
		this.carga=CARGA_DEF;
	}
	
	public Lavadora(String color, char consumo, Double precio_base, int peso, int carga) {
		super(color, consumo, precio_base, peso);
		this.carga=carga;

	}
	
	public int getCarga() {
		return carga;
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public double precioFinal(){
		double pfinal=super.precioFinal();
		if(this.carga>30) {
			pfinal=pfinal+50;
		}
		
		return pfinal;
		
	}
	

}
