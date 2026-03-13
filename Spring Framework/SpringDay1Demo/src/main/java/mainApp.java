import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Player.xml");
		Player ref=(Player) ctx.getBean("ply");
		System.out.println(ref);
		
		
	}

}
