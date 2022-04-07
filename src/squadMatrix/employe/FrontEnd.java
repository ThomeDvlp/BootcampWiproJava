package squadMatrix.employe;

public class FrontEnd extends Employe{

	public FrontEnd(String name, String cpf, double salary) {
		super(name, cpf, salary);

	}
	
	public void bonus(double value) {
		System.out.println(getClass().getSimpleName() + ".bonus: " + (salary + value));
	}
}
