import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Are helloWorlds equal? - " + bean.equals(secondBean));
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat secondCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println("First cat weighs - " + catBean.getWeight());
        System.out.println("Second cat weighs - " + secondCatBean.getWeight());
        System.out.println("Are cats equal? - " + catBean.equals(secondCatBean));
    }
}