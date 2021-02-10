package ejercicio2;

public class Videojuego implements Entregable {
	private String titulo;
	protected int horas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.titulo=" ";
		this.horas=10;
		this.entregado=false;
		this.genero=" ";
		this.compañia=" ";
	}
	
	public Videojuego(String titulo, int horas) {
		this.titulo=titulo;
		this.horas=horas;
		this.entregado=false;
		this.genero=" ";
		this.compañia=" ";
	}
	
	public Videojuego(String titulo, int horas,String genero,String compañia) {
		this.titulo=titulo;
		this.horas=horas;
		this.entregado=false;
		this.genero=genero;
		this.compañia=compañia;
	}
	 
	
	public String getCompañia() {
		return compañia;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getHoras() {
		return horas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Informacion del Videojuego\n"

                + "Titulo: " + titulo + "\n"

                + "Horas estimadas: " + horas + "\n"

                + "Entregado: " + entregado + "\n"

                + "Genero: " + genero + "\n"

                + "Compañia: " + compañia + "\n";
	}

	@Override
	public void entregar() {
		this.entregado=true;
	}

	@Override
	public void devolver() {
		this.entregado=false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public boolean compareTo(Object obj) {
		int a = (int) obj;
		if(this.horas<a) {
			return true;
		}
		return false;

	}
	
}
