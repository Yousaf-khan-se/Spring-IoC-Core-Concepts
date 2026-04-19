//----------------------Q1
package lab10.i228797_F;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("I228797_F_beans_Q1.xml");
    	
    	I228797_Coffee coffee = (I228797_Coffee) context.getBean("Latte");
    	
    	I228797_CoffeeShop.DisplayCoffeeDetails(coffee);
    }
}
