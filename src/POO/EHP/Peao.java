package POO.EHP;

public class Peao extends Peca {
	
	public String cor() {
		return "Azul";
	}

	@Override
	public void mover() {
		System.out.println("Anda para frente");	
	}
}
