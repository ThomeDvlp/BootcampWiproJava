package squadMatrix.television;

public class RemoteControl {

	public static void main(String[] args) {
		new RemoteControl();
	}

	private Television television;

	public RemoteControl() {
		television = new Television();

		System.out.println("############# Volume #############");
		System.out.println(television.displayVolume());
		television.increaseVolume();
		System.out.println(television.displayVolume());
		television.decreaseVolume();
		System.out.println(television.displayVolume());
		for (int i = 0; i < 100; i++) {
			television.increaseVolume();
		}
		System.out.println(television.displayVolume());

		System.out.println("############# Chanel #############");
		television.setChanel(11);
		System.out.println(television.displayChanel());
		television.increaseChanel();
		System.out.println(television.displayChanel());
		television.decreaseChanel();
		System.out.println(television.displayChanel());
		
		for (int i = 0; i < 100; i++) {
			television.increaseChanel();
		}
		System.out.println(television.displayChanel());
	}
}
