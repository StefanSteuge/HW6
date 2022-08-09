package xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
        public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("xmlConfig.xml");
        Calculator calculator = (Calculator) beanFactory.getBean("calculator");

                System.out.println(calculator.getMinusService().getResultMinus());
                System.out.println(calculator.getPlusService().getResultPlus());
    }
}
