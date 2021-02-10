package ejercicio6;

/**
 * @author Usuario
 *
 */
public class Sala extends Pelicula {
	private double precio;
	
	/**
	 * @param titulo
	 * @param duracion
	 * @param edad
	 * @param director
	 * @param precio
	 */
	public Sala(String titulo, int duracion, int edad, String director, double precio) {
		super(titulo, duracion, edad, director);
		this.precio=precio;
	}
	

	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return super.toString()+"Precio: "+ precio +" €\n";
	}
	
}
