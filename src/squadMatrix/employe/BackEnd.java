package squadMatrix.employe;

public class BackEnd extends Employe{

	public BackEnd(String name, String cpf, double salary) {
		super(name, cpf, salary);
		// TODO Auto-generated constructor stub
	}
	
	public void bonus(double value) {
		System.out.println(getClass().getSimpleName() + ".bonus: " + (salary + value));
	}
}
