//------------------------------Q2
package lab10.I228797_F_Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("I228797_F_Mp3-beans_Q2.xml");
    	
    	I228797_MP3.PlayKalam();
    }
}
