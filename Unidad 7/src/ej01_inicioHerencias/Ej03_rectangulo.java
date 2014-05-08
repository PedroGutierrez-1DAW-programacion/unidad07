package ej01_inicioHerencias;

public class Ej03_rectangulo extends Ej03_cuadrado{
	
	Ej03_rectangulo(int ancho, int alto){
		setAncho(ancho);
		setAlto(alto);
	}

	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho > 0 ? ancho : POR_DEFECTO;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto > 0 ? alto : POR_DEFECTO;
	}
	
	public String morfologia(){
		if(this.alto == this.ancho) return "Cuadrado";
		if(this.alto > this.ancho) return "Vertical";
		return "Horizontal";
	}

}
