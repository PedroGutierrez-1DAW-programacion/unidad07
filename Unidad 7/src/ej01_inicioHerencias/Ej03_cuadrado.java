package ej01_inicioHerencias;

public class Ej03_cuadrado {
	protected int alto;
	protected int ancho;
	protected final int POR_DEFECTO = 4;
	
	public Ej03_cuadrado(){
		setAncho(0);
	}
	public Ej03_cuadrado(int ancho){
		setAncho(ancho);
	}
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.alto = ancho > 0 ? ancho : POR_DEFECTO;
		this.ancho = this.alto;
	}
	
	public int calcularArea(){
		return this.alto * this.ancho;
	}
	public int calcularPerimetro(){
		return this.alto * 2 +  this.ancho * 2;
	}
	
	public String toString(){
		String resp = "";
		for(int y=0; y<this.alto; y++){
			for(int x=0; x<this.ancho; x++)
				resp += " *";
			resp += "\n";
		}
		return resp;
	}
}
