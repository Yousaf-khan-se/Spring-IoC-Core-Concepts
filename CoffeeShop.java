package lab10.i228797_F;

public class I228797_CoffeeShop {
	
	public I228797_CoffeeShop()
	{
	}
	
	public static void DisplayCoffeeDetails(I228797_Coffee coffee)
	{
		System.out.println("Coffee Details: \n"
				+ "   Type: " + coffee.getType() + "\n"
						+ "   Size: " + coffee.getSize() + "\n"
								+ "   Price: $" + coffee.getPrice() + "\n");
	}
}
