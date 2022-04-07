package squadMatrix.solids;

public class Circle implements IGeometricShape{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String numberOfSides() {
		return "1";
	}

	@Override
	public double area(double a, double b) {
		b = 3.14;
		return ((a * a) * b)/2;
	}

	@Override
	public double area(double a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
