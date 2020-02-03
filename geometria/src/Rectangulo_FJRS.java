/**
* @author Francisco
* Francisco Javier Riquelme Sánchez
* Versión 1.2
*/

public class Rectangulo extends FiguraGeometrica {
	private double l1;
	private double l2;
	
	/*
	 * Constructor
	 * @param tipoFigura
	 * @param 1G
	 * @param 1P
	 */
	
	public Rectangulo(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Mide area
	 */
	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/*
	 * Mide perimetro
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
