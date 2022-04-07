package POO.EHP;

import java.awt.SystemTray;

public class Jogo {
	public static void main(String[] args) {
		Peao p = new Peao();
		Cavalo c = new Cavalo();
		Bispo b = new Bispo();

		System.out.println(p.cor());
		System.out.println(c.cor());
		c.mover();
		b.mover();
	}
}
