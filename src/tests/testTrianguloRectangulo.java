package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import clases.TrianguloRectangulo;

public class testTrianguloRectangulo {
	@Test
	void testTrianguloDefecto() {
		TrianguloRectangulo tria1 = new TrianguloRectangulo();
		double hipo1 = tria1.hipotenusa();
		double area1 = tria1.area();
		double peri1 = tria1.perimetro();
	}
	@Test
	void testTrianguloValido(){
		try {
		double a=2;
		double b=5;
		TrianguloRectangulo tria2 = new TrianguloRectangulo(a,b);
		double hipo2 = tria2.hipotenusa();
		double area2 = tria2.area();
		double peri2 = tria2.perimetro();
		if(a<=0||b<=0)
			throw new IllegalArgumentException("Los catetos no pueden ser menor o iguales a 0");
		
	}catch (IllegalArgumentException e){
		System.out.println(e.getMessage());
	}
	}
	@Test
	void testTrianguloNoValido(){
		try {
		double a=-2;
		double b=5;
		TrianguloRectangulo tria3 = new TrianguloRectangulo(a,b);
		double hipo3 = tria3.hipotenusa();
		double area3 = tria3.area();
		double peri3 = tria3.perimetro();	
		if(a<=0||b<=0)
			throw new IllegalArgumentException("Los catetos no pueden ser menor o iguales a 0");
		
	}catch (IllegalArgumentException e){
		System.out.println(e.getMessage());
	}
	}
}
