import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat secondCatbean = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == secondBean);
        System.out.println(catBean == secondCatbean);
    }
}