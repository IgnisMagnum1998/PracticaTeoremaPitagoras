package app;
import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		TrianguloRectangulo tria1 = new TrianguloRectangulo(2,5);
		TrianguloRectangulo tria2 = new TrianguloRectangulo();
		
		double area1 = tria1.area();
		double area2 = tria2.area();
		double peri1 = tria1.perimetro();
		double peri2 = tria2.perimetro();
	}

}
