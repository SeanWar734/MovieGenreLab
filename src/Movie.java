public class Movie {
	private String name;
	private String genre;


	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre;		
	}

	public Movie() {
	}
	
	public String toString() {
		return String.format("Person[name: %s,Genre: %s]", name, genre);
	}
	
///////////////////////////////////////     Getters and Setters    ////////////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}



