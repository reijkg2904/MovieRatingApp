package movieRatingApp;

public class StreamingWebsite {
	
	private Movies[] aMovie;
	private int numMovie;
	
	public Movies[] getaMovie() {
		return aMovie;
	}

	public void setaMovie(Movies[] aMovie) {
		this.aMovie = aMovie;
	}

	public int getNumMovie() {
		return numMovie;
	}

	public void setNumMovie(int numMovie) {
		this.numMovie = numMovie;
	}

	public StreamingWebsite ()
	{
		this.setaMovie(new Movies[5]);
		this.setNumMovie(0);
	}
	
	public void add(Movies a)
	{
		if (numMovie<aMovie.length)
		{
			this.aMovie[numMovie] = a;
			numMovie++;
		}
	}
	
	public String toString()
	{
		int num = 1;
		StringBuffer string = new StringBuffer();
		
		for (int i=0; i<numMovie; i++)
		{
			string.append(num++);
			string.append(". ");
			string.append(aMovie[i]);
			string.append("\n");
		}
		return string.toString();

	}
	
	public Movies displayMovie(int num)
	{
		if(num>=1 && num<=aMovie.length)
		{
			return aMovie[num-1];
		}
		else return null;
	}
	
	

}
