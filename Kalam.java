package lab10.I228797_F_Q2;

public class I228797_Kalam {
	private String type;
	private String name;
	private String author;
	
	public I228797_Kalam(String type, String name, String author) {
		this.type = type;
		this.name = name;
		this.author = author;
	}

	public I228797_Kalam() {
		this.type = "";
		this.name = "";
		this.author = "";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
