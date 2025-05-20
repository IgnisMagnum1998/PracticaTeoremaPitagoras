package clases;

public class TrianguloRectangulo {
	/**
	 * Creo mis variables de los dos catetos a y b y la hipotenusa c
	 */
	double a;
	double b;
	double c;
	/**
	 * Constructor donde dos de los catetos son 1 y la hipotenusa se calcula automáticamente.
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
		this.c= hipotenusa();
	}
	/**
	 * Constructor donde inserto dos catetos y recibo la hipotenusa. Ninguno de los dos catetos debe ser menor o igual a 0.
	 * En tal caso, saltará una excepción.
	 * @param a cateto 1
	 * @param b cateto 2
	 */
	public TrianguloRectangulo(double a, double b) {

		try {
			this.a = a;
			this.b = b;
			this.c= (this.a+this.b)*Math.sqrt(2);
			
			if(this.a<=0||this.b<=0)
				throw new IllegalArgumentException("Los catetos no pueden ser menor o iguales a 0");
			
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
	/**
	 * @return area devuelve el 
	 * area
	 */
	public double area() {
		double area;
		area=(this.a*this.b)/2;
		return area;
	}
	/**
	 * @return hipotenusa devuelve la hipotenusa
	 */
	public double hipotenusa() {
		double hipotenusa;
		hipotenusa= (this.a+this.b)*Math.sqrt(2);
		return hipotenusa;
	}
	/**
	 * @return perimetro devuelve el perimetro
	 */
	public double perimetro() {
		double hip=hipotenusa();
		double perimetro;
		perimetro=this.a+this.b+hip;
		return perimetro;
	}
	/**
	 * @return this.a devuelve el cateto 1
	 */
	public double getA() {
		return this.a;
	}
	/**
	 * @param a le asigno el valor al cateto 1
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * @return b devuelve el cateto 2
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b le asigno el valor al cateto 2
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return c devuelvo la hipotenusa
	 */
	public double getC() {
		return c;
	}
	/**
	 * @param c le asigno el valor a la hipotenusa
	 */
	public void setC(double c) {
		this.c = c;
	}
	
	@Override
	public String toString () {
		String mensaje="";
		mensaje+="Cateto 1: "+this.a+" Cateto 2: "+this.b+" Hipotenusa: "+this.c;
		return mensaje;
	}
}
