package ejercicio1;

public class Electrodomestico {
	
	private final static double PRECIO_DEF = 100;
	private final static String COLOR_DEF = "blanco";
	private final static char CONSUMO_DEF = 'F';
	private final static int PESO_DEF = 5;
	
	protected double precio_base;
	protected String color;
	protected char consumo;
	protected int peso;
	
	
	public Electrodomestico() {
		this.color=COLOR_DEF;
		this.consumo=CONSUMO_DEF;
		this.precio_base=PRECIO_DEF;
		this.peso=PESO_DEF;
	}
	
	


	public Electrodomestico(double precio_base, int peso) {
		this.color=COLOR_DEF;
		this.consumo=CONSUMO_DEF;
		this.precio_base=precio_base;
		this.peso=peso;
	}
	
	public Electrodomestico(String color, char consumo, double precio_base, int peso) {
		this.color=color;
		this.consumo=consumo;
		this.precio_base=precio_base;
		this.peso=peso;
		comprobarColor();
		comprobarConsumo();
	}
	
	
	private void comprobarConsumo() {

		if (this.consumo != 'A' && this.consumo != 'B' && this.consumo != 'C' && this.consumo != 'D' && this.consumo != 'E' && this.consumo != 'F') {
            this.consumo = CONSUMO_DEF;

        }		
	}


	private void comprobarColor() {
		
		this.color= this.color.toLowerCase();

		if (!this.color.equals("blanco") && !this.color.equals("negro") && !this.color.equals("rojo") && !this.color.equals("azul") && !this.color.equals("gris")) {
            this.color = COLOR_DEF;

        }
		
	}

	protected double precioFinal() {
		double letra=0;
		
		double tamaño=0;
		switch(this.consumo) {
			case 'A':
				letra= 100;
				break;
			case 'B':
				letra= 80;
				break;
			case 'C':
				letra= 60;
				break;
			case 'D':
				letra= 50;
				break;
			case 'E':
				letra= 30;
				break;
			case 'F':
				letra= 10;
				break;
		}
		
		if(this.peso>=0 && this.peso<=19) {
			tamaño=10;
		}
		if(this.peso>=20 && this.peso<=49) {
			tamaño=50;
		}
		if(this.peso>=50 && this.peso<=79) {
			tamaño=80;
		}
		if(this.peso>=80) {
			tamaño=100;
		}
		

		
		return this.precio_base+(letra+tamaño);


		
	}
	
	
	
	public String getColor() {
		return color;
	}
	
	public char getConsumo() {
		return consumo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public double getPrecio_base() {
		return precio_base;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Informacion del Electrodomestico\n"

                + "Color: " + color + "\n"

                + "Consumo: " + consumo + "\n"

                + "Peso: " + peso + " Kg\n"

                + "Precio: " + precio_base + " €\n";
		
		
		
	}
	
	
	
	


	
	
	
	
}
