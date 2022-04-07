package squadMatrix.solids;

public class Principal {
	public static void main(String[] args) {
		System.out.println("areaCírculo: " + EShape.CIRCLE.getShape().area(3, 3.14));
		System.out.println("areaQuadrado: " + EShape.SQUARE.getShape().area(3, 3.14));
		System.out.println("areaRetangulo: " + EShape.RECTANGLE.getShape().area(3, 3.14));
		System.out.println("areaTrianguloRetangulo: " + EShape.RIGTHTRIANGLE.getShape().area(3, 3.14));
	}
}
