package lab10.i228797_F;

public class I228797_Coffee {
	
	protected String type;
	protected String size;
	protected float price;
	
	public I228797_Coffee()
	{
		type = "null";
		size = "null";
		price = 0.0f;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
