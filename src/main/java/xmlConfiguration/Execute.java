package xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

    public static void main(String[] args) {
        {
            BeanFactory execute = new ClassPathXmlApplicationContext("xmlConfig.xml");}

    }

}
