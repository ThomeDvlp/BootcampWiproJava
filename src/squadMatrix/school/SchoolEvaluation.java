package squadMatrix.school;

public class SchoolEvaluation {
	private int registration;

	private String name;

	private float score;

	public SchoolEvaluation(int i, String string, float f) {
		registration = i;
		name = string;
		score = f;
	}


	public int getRegistration() {
		return this.registration;
	}

	public String getName() {
		return this.name;
	}

	public float getScore() {
		return this.score;
	}
}
