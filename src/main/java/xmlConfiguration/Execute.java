package xmlConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
        public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig.xml");
            MinusService minusService = context.getBean("minusService", MinusService.class);
            PlusService plusService = context.getBean("plusService", PlusService.class);
            Calculator calculator = context.getBean("calculator", Calculator.class);
                System.out.println(calculator);
                context.close();

    }
}
