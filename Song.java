package assignment;

public class Song {
	private String filename = "";
	private String title = "";
	private String Artits = "";
	private String fileLocation = "";

	public Song(String filename, String title, String Artits, String fileLocation) {
		this.filename = filename;
		this.title = title;
		this.Artits = Artits;
		this.fileLocation = fileLocation;
	}

	public String toString() {
		return this.Artits + "-" + this.title;

	}
}
