package squadMatrix.solids;

public class RigthTriangle implements IGeometricShape{

	@Override
	public String color() {
		
		return "vermelho";
	}

	@Override
	public String numberOfSides() {
		
		return "3";
	}


	@Override
	public double area(double a, double b) {
		return (a*b)/2;
	}

	@Override
	public double area(double a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
