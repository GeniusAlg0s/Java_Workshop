package ifkeywordsandcodeblock;

public class ifstatements {
	public static void main(String[] args) {
		boolean gameover = true;
		int score = 5000;
		int levelcomplete = 5;
		int bonus = 100;
		
		if(score == 5000) {
			System.out.println("Your score wass 5000");
		}
		if(score < 5000) {
			System.out.println("Your score wass  less 5000");
		}
		else {
			System.out.println("here we are");
		}
		score = 900;
		if((score < 5000) && (score > 1000)) {
			System.out.println("Your score wass  less 5000");
		}
		else if(score < 1000){
			System.out.println("weak sauce");
		}
		else {
			System.out.println("here we are");
		}
	
	if(gameover == true) {
		int finalscore = score + (levelcomplete * bonus);
		System.out.println("final score is  : " + finalscore);
	}
	if(gameover) {
		int finalscore = score + (levelcomplete * bonus);
		finalscore += 1000;
		System.out.println("final score is  : " + finalscore);
	}
	 score = 10000;
	levelcomplete = 8;
	bonus = 200;
	
	if(gameover) {
		int finalscore = score + (levelcomplete * bonus);
		System.out.println("final score is  : " + finalscore);
	}
	}
}



