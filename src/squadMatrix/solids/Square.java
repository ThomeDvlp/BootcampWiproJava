package squadMatrix.solids;

public class Square implements IGeometricShape {

	@Override
	public String color() {
		return "verde";
	}

	@Override
	public String numberOfSides() {
		return "4";
	}


	@Override
	public double area(double a, double b) {
		return a * a;
	}

	@Override
	public double area(double a) {
		return a * a;
	}

}
