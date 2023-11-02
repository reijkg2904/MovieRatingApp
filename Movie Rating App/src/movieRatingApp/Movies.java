package movieRatingApp;

public class Movies {
	
	private String name;
	private String director;
	private double rating;
	private int numRating;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNumRating() {
		return numRating;
	}

	public void setNumRating(int numRating) {
		this.numRating = numRating;
	}
	
	public Movies(String name, String director)
	{
		this.setName(name);
		this.setDirector(director);
		this.setRating(0);
		this.setNumRating(0);
	}
	
	public String toString()
	{
		return "Movie: "+getName()+" by "+getDirector()+" has the average rating of "+getRating()+", rated by "+getNumRating()+" persons";
	}
	
	public double averageRating(double rate)
	{
		this.rating = (((this.getRating()*this.numRating)+rate)/(this.numRating+1));
		this.numRating = this.numRating+1;
		return this.rating;
	}
	


}
