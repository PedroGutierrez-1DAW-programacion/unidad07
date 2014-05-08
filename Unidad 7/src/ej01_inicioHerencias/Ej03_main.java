package ej01_inicioHerencias;

public class Ej03_main {

	public static void main(String[] args) {
		
		Ej03_cuadrado cuadrado = new Ej03_cuadrado();
		
		System.out.println(cuadrado.calcularPerimetro());
		
		System.out.println(cuadrado);
		
		Ej03_rectangulo rectangulo = new Ej03_rectangulo(8, 4);
		
		System.out.println(rectangulo.calcularPerimetro());
		
		System.out.println(rectangulo.morfologia());
		
		System.out.println(rectangulo);

	}

}
