package xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContext.xml");
        GamblingMachine gamblingMachine = context.getBean("gamblingMachine", GamblingMachine.class);
        System.out.println(gamblingMachine.draw());
        System.out.println(gamblingMachine.getMessage());
        context.close();
    }
}
