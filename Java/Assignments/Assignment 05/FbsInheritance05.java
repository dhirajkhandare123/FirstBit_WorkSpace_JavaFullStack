
class Artist{
	String name;
	int age;
	
	Artist() {
		this.name = "NA";
		this.age = 0;
	}
	
	Artist(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}


class Painter extends Artist{
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	Painter() {
		super();
		this.paintingStyle = "NA";
		this.mediumUsed = "NA";
		this.numberOfPaintings = 0;
	}
	
	Painter(String name, int age, String paintingStyle, String mediumUsed, int numberOfPaintings) {
		super(name, age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}

	String getPaintingStyle() {
		return paintingStyle;
	}

	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	String getMediumUsed() {
		return mediumUsed;
	}

	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}

	int getNumberOfPaintings() {
		return numberOfPaintings;
	}

	void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}
	
	void display() {
		super.display();
		System.out.println("Painting Style: "+this.paintingStyle);
		System.out.println("Medium Used: "+this.mediumUsed);
		System.out.println("Number of Paintings: "+this.numberOfPaintings);
	}
}


class Musician extends Artist{
	String instrument, musicGenre;
	int numberOfAlbums;
	
	Musician() {
		super();
		this.instrument = "NA";
		this.musicGenre = "NA";
		this.numberOfAlbums = 0;
	}
	
	Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {
		super(name, age);
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}

	String getInstrument() {
		return instrument;
	}

	void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	String getMusicGenre() {
		return musicGenre;
	}

	void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}

	int getNumberOfAlbums() {
		return numberOfAlbums;
	}

	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
	
	void display() {
		super.display();
		System.out.println("Instrument: "+this.instrument);
		System.out.println("Music Genre: "+this.musicGenre);
		System.out.println("Number of Albums: "+this.numberOfAlbums);
	}
	
}


class Actor extends Artist{
	String filmIndustry;
	int numberOfMovies;
	
	Actor() {
		super();
		this.filmIndustry = "NA";
		this.numberOfMovies = 0;
	}
	
	Actor(String name, int age, String filmIndustry, int numberOfMovies) {
		super(name, age);
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}

	String getFilmIndustry() {
		return filmIndustry;
	}

	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}

	int getNumberOfMovies() {
		return numberOfMovies;
	}

	void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	void display() {
		super.display();
		System.out.println("Film Industry: "+this.filmIndustry);
		System.out.println("Number of Movies: "+this.numberOfMovies);
	}
	
}


public class FbsInheritance05 {

	public static void main(String[] args) {
		
		Painter p1 = new Painter("Om", 20, "Expressionism", "watercolor", 130);
		p1.display();
		
		System.out.println();
		
		Musician m1 = new Musician("Keshav", 24, "Guitar", "Devotional songs", 20);
		m1.display();
		
		System.out.println();
		
		Actor a1 = new Actor("Tony Stark", 43, "Bollywood", 51);
		a1.display();
	}

}
