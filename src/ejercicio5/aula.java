package ejercicio5;

public class aula {
	private int identificador;
	private int n_maximo;
	private String destino;
	private final String DESTINADA="matematicas";
	
	public aula(int identificador, int n_maximo, String destino) {
		this.identificador = identificador;
		this.n_maximo = n_maximo;
		this.destino = destino;
		comprobarDestino();

	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getN_maximo() {
		return n_maximo;
	}

	public void setN_maximo(int n_maximo) {
		this.n_maximo = n_maximo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	private void comprobarDestino() {
		if(!this.destino.equals("matematicas") && !this.destino.equals("filosofia") && !this.destino.equals("fisica")) {
			this.destino=DESTINADA;
		}
	}
	
	@Override
	public String toString() {
		return "Informacion del aula\n"

                + "Identificador: " + identificador + "\n"

                + "Nº maximo: " + n_maximo + "\n"

                + "Destinada: " + destino + " \n";
	}
	
	
	
	
	
}
