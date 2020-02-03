
public class Triangulo_FJRS extends FiguraGeometrica_FJRS {
	private double a;
	private double b;
	private double c;
	
	public Triangulo_FJRS(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return a + b + c;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-a) * (sp-b) * (sp-c));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
