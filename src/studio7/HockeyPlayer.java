package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private String shootingHand;
	private boolean rightHanded;
	private int careerGoals;
	private int careerAssists;
	public HockeyPlayer(String n, int jN, String sH, boolean rH, int cG, int cA) {
		name = n;
		jerseyNumber = jN;
		shootingHand = sH;
		rightHanded = rH;
		careerGoals = cG;
		careerAssists = cA;
	}
	public String getName() {
		return name;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public String getShootingHand() {
		return shootingHand;
	}
	public boolean getRightHanded() {
		return rightHanded;
	}
	public int getCareerGoals() {
		return careerGoals;
	}
	public int getCareerAssists() {
		return careerAssists;
	}
	/**
	 * 
	 * @return 
	 */
	
	public int points() {
		return careerGoals + careerAssists;
	}
	
	/**
	 *  the setter for new games!
	 * @param goals is the number of goals scored this game
	 * @param assists is the number of assists provided this game
	 */
	public void postGameAnalysis(int goals, int assists) {
		careerGoals = careerGoals + goals;
		careerAssists = careerAssists + assists;
		points();
	}
	
	

	public static void main(String[] args) {
		HockeyPlayer Wayne = new HockeyPlayer("Wayne Gretzky", 99, "left-handed", true, 894, 1963);
		System.out.println(Wayne.getName());
		System.out.println(Wayne.getJerseyNumber());
		System.out.println(Wayne.getShootingHand());
		System.out.println(Wayne.getRightHanded());
		System.out.println(Wayne.getCareerGoals());
		System.out.println(Wayne.getCareerAssists());
		System.out.println(Wayne.points());
		
		System.out.println("POST GAME ANALYSIS WITH MVP WAYNE!");
		Wayne.postGameAnalysis(5, 3);
		System.out.println(Wayne.getCareerGoals());
		System.out.println(Wayne.getCareerAssists());
		System.out.println(Wayne.points());
		
		
	}

}
