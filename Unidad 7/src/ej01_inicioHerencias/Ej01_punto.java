package ej01_inicioHerencias;

public class Ej01_punto {
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public String toString(){
		String resp = "";
		resp += String.format("Eje %s %4d\n", "X", this.x);
		resp += String.format("Eje %s %4d\n", "Y", this.y);
		return resp;
	}
}
