package squadMatrix.solids;

public enum EShape {
	CIRCLE(new Circle()),
	SQUARE(new Square()),
	RECTANGLE(new Rectangle()),
	RIGTHTRIANGLE(new RigthTriangle());
	
	private IGeometricShape shape;
	
	private EShape(IGeometricShape shape) {
		this.shape = shape;
	}

	public IGeometricShape getShape() {
		return this.shape;
	}
}
