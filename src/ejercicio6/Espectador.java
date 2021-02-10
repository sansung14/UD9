package ejercicio6;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	private String asiento;
	
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.asiento="";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	

	
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}
	
	public String getAsiento() {
		return asiento;
	}
	
}

