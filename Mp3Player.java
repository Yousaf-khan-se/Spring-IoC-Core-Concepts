package lab10.I228797_F_Q2;

public class I228797_MP3 {
	private static I228797_Kalam kalam;


	public static void setKalam(I228797_Kalam kalam) {
		I228797_MP3.kalam = kalam;
	}

	public static void PlayKalam()
	{
		System.out.println("type: " + kalam.getType() + "\n"
				+ "name: " + kalam.getName() + "\n"
						+ "author: " + kalam.getAuthor() + "\n");
	}
}
