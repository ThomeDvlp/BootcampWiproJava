package squadMatrix.solids;

public interface IGeometricShape {
	String color();
	
	String numberOfSides();

	double area(double a, double b);
	
	double area(double a);
}
