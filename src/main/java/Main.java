import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
        iPhone xs=(iPhone)app.getBean("XS");
        xs.getPhoneInfo();
        Galaxy s10=(Galaxy)app.getBean("s10");
        s10.getPhoneInfo();
    }
}