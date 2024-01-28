import com.fei.beans.User;
import com.fei.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		User user = (User) context.getBean("user");



		System.out.println(user);


	}

}
