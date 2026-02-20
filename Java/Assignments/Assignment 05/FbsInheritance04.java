class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	Player() {
		this.name = "NA";
		this.age = 0;
		this.country = "NA";
		this.matchesPlayed = 0;
		this.jerseyNumber = 0;
	}
	
	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	int getJerseyNumber() {
		return jerseyNumber;
	}

	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Country: "+this.country);
		System.out.println("Matches: "+this.matchesPlayed);
		System.out.println("Jersy Number: "+this.jerseyNumber);
	}
}

class CricketPlayer extends Player{
	int totalRuns, totalWickets;
	String battingStyle, bowlingStyle;
	
	CricketPlayer() {
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = "NA";
		this.bowlingStyle = "NA";
	}
	
	CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {
		super(name, age,country, matchesPlayed, jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	int getTotalRuns() {
		return totalRuns;
	}

	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	int getTotalWickets() {
		return totalWickets;
	}

	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	String getBattingStyle() {
		return battingStyle;
	}

	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	String getBowlingStyle() {
		return bowlingStyle;
	}

	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
	void display() {
		super.display();
		System.out.println("Runs: "+this.totalRuns);
		System.out.println("Wickets: "+this.totalWickets);
		System.out.println("Batting Style: "+this.battingStyle);
		System.out.println("Bowling Style: "+this.bowlingStyle);
	}
}

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	FootballPlayer() {
		super();
		this.totalGoals = 0;
		this.playingPosition = "NA";
	}
	
	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber, int totalGoals, String playingPosition) {
		super(name, age, country, matchesPlayed, jerseyNumber);
		this.totalGoals = totalGoals;
		this.playingPosition = playingPosition;
	}

	int getTotalGoals() {
		return totalGoals;
	}

	void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}

	String getPlayingPosition() {
		return playingPosition;
	}

	void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}
	
	void display() {
		super.display();
		System.out.println("Total Goals: "+this.totalGoals);
		System.out.println("Playing Position: "+this.playingPosition);
	}
}


public class FbsInheritance04 {

	public static void main(String[] args) {
		
		CricketPlayer c1 = new CricketPlayer("Sachin Tendulkar", 56, "India", 410, 10, 17000, 13, "Right Handed", "Right Arm Spin");
		c1.display();
		
		System.out.println();
		
		FootballPlayer f1 = new FootballPlayer("Krishna Ronaldo", 39, "Portugal", 523, 7, 810, "Left Winger");
		f1.display();

	}

}
