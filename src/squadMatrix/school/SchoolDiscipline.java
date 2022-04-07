package squadMatrix.school;

public class SchoolDiscipline {
	public static void main(String[] args) {
		new SchoolDiscipline();
	}

	public SchoolDiscipline() {
		SchoolEvaluation[] list = {
				new SchoolEvaluation(123, "Aluno1", 7.5f),
				new SchoolEvaluation(123, "Aluno1", 8.0f),
				new SchoolProject(123, "Aluno1", 7.0f)
		};
		float average = average(list);
		System.out.println("Média=" + average);
		System.out.println("Recuperação=" + educationalRecovery(average));
	}

	private float average(SchoolEvaluation[] list) {
		float average = 0;
		for (SchoolEvaluation SchoolEvaluation : list) {
			if (SchoolEvaluation instanceof SchoolProject) {
				average += SchoolEvaluation.getScore() * 2.0;
			} else {
				average += SchoolEvaluation.getScore() * 1.5;
			}
		}
		return (average / 5);
	}

	private int educationalRecovery(float average) {
		if (average > 7) { 
			return 0;
		}
		return 1;
	}
}
