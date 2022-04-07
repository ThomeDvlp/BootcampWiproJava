package squadMatrix.employe;

public abstract class Employe {

	protected String name;
	protected String cpf;
	protected double salary;
	
	public Employe(String name, String cpf, double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract void bonus(double value);

}
