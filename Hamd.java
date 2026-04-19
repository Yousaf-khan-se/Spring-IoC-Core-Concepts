package lab10.I228797_F_Q2;

import org.springframework.beans.factory.annotation.Autowired;

public class I228797_Hamd extends I228797_Kalam{

	@Autowired
	public I228797_Hamd(String type, String name, String author) {
		super(type, name, author);
	}
	
}
