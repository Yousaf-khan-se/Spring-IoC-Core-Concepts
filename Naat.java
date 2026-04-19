package lab10.I228797_F_Q2;

import org.springframework.beans.factory.annotation.Autowired;

public class I228797_Naat extends I228797_Kalam{

	@Autowired
	public I228797_Naat(String type, String name, String author) {
		super(type, name, author);
	}

}
