package squadMatrix;

public class Television {

	private int volume;
	private int chanel;

	public int displayVolume() {
		return volume;
	}

	public void increaseVolume() {
		if (volume < 10) {
			volume++;
		}
	}

	public void decreaseVolume() {
		if (volume > 0) {
			volume--;
		}
	}

	public void setChanel(int i) {
		if (chanel > 0 && chanel < 10) {
			chanel = i;
		}
	}

	public void increaseChanel() {
		if (chanel < 10) {
			chanel++;
		}
	}

	public void decreaseChanel() {
		if (chanel > 0) {
			chanel--;
		}
	}

	public int displayChanel() {
		return chanel;
	}
}