package xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
        public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("xmlConfig.xml");

        MinusService minusService = beanFactory.getBean("minusService", MinusService.class);
        PlusService plusService = beanFactory.getBean("plusService", PlusService.class);
                System.out.println(minusService.getResultMinus());
                System.out.println(plusService.getResultPlus());

//        Calculator calculator = (Calculator) beanFactory.getBean("calculator");
//                System.out.println(calculator.getMinusService().getResultMinus());
//                System.out.println(calculator.getPlusService().getResultPlus());
    }
}
