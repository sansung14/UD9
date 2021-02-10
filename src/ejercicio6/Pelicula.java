package ejercicio6;

public class Pelicula {
	private String titulo;
	private int duracion;
	private int edad;
	private String director;
	
	public Pelicula(String titulo, int duracion, int edad, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula: "+"\n" +
				"Titulo: " + titulo + "\n" +
				"Duracion: " + duracion + "\n" +
				"Edad minima: " + edad + "\n" +
				"Director: " + director + "\n";
	}
	
	
	
}
