package ej01_inicioHerencias;

public class Ej01_punto3d extends Ej01_punto{
	protected int z;
	
	public Ej01_punto3d(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString(){
		String resp = "";
		resp += super.toString();
		resp += String.format("Eje %s %4d\n", "Z", this.z);
		return resp;
	}
}
