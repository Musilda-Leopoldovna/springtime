import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("myau");
        Cat beanCat2 = (Cat) applicationContext.getBean("myau");

        System.out.println(bean.getMessage());
        System.out.println(bean.getMessage());
        System.out.printf("Links is equal: %s.", bean == bean2);
        System.out.println();
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat.getMessage());
        System.out.printf("Links is equal: %s.", beanCat == beanCat2);
    }
}