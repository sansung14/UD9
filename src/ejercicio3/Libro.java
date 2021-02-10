package ejercicio3;

import ejercicio2.Entregable;
import ejercicio2.Serie;
import ejercicio2.Videojuego;

public class Libro {
	
	private double ISBN;
	private String titulo;
	private String autor;
	private int paginas;
	
	
	public String getAutor() {
		return autor;
	}
	
	public double getISBN() {
		return ISBN;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void comprobarLongitud() {
		long ipart = (long) this.ISBN;
		if((Long.toString(ipart)).length()!=13) {
			System.out.println("La longitud del ISBN no es correcto");
		}
		
		
	}
	

	
	
	@Override
	public String toString() {
		return "El libro con ISBN "+ (long) ISBN + " creado por el autor "+ autor +" tiene "+ paginas +" pàginas";
	}
	
	public Libro(String titulo, String autor, double ISBN, int paginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		this.paginas=paginas;
		comprobarLongitud();
	}
	
	
	public static void main(String[] args) {
		
		Libro libro1=new Libro("La Biblia","Dios",1234567890123.00,200);
		Libro libro2=new Libro("Bricomaniacos","EL Hipi",9389264820382.00,120);

		System.out.println(libro1);
		System.out.println(libro2);

		if (libro1.getPaginas()==libro2.getPaginas()){
            System.out.println("El libro "+libro1.getTitulo()+" tiene las mismas paginas que el libro "+libro2.getTitulo());
        }else if(libro1.getPaginas()>libro2.getPaginas()){
            System.out.println("El libro "+libro1.getTitulo()+" tiene mas paginas que el libro "+libro2.getTitulo());
        }else {
            System.out.println("El libro "+libro2.getTitulo()+" tiene mas paginas que el libro "+libro1.getTitulo());
        }
		
	}
	
	
	
}
