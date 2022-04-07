package squadMatrix.employe;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Employe f1 = new FrontEnd("Fulano", "123456789", 3500f);
		Employe f2 = new BackEnd("Beltrano", "987654321", 4000f);

		f1.bonus(500);
		f2.bonus(700);
	}
}
