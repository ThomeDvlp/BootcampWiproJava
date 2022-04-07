package squadMatrix.solids;

public class Rectangle implements IGeometricShape {

	@Override
	public String color() {
		return "azul";
	}

	@Override
	public String numberOfSides() {
	
		return "4";
	}


	@Override
	public double area(double a, double b) {
	
		return a * b;
	}

	@Override
	public double area(double a) {
		return 0;
	}

}
