package uk.ac.belfastmet.topten.domain;

public class Topten {
	
	private String artist;
	private String title;
	private String image;

	
	public Topten() {
		super();
	}
	
	
	public Topten(String artist, String title, String image) {
		super();
		this.artist = artist;
		this.title = title;
		this.image = image;
	}


	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String toString() {
		return artist + " " + title + " " +image;
	}
}
