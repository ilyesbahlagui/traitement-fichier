package yuka;

public class ScoreNutri {

	private String score;

	public ScoreNutri(String score) {

		this.score = score;
	}
	@Override
	public String toString() {
		return "" + score ;
	}


	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

}
