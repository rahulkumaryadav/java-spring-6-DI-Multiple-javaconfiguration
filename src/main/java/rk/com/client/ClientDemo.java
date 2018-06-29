package rk.com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rk.com.beans.Organisation;
import rk.com.config.BeanConfig;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
        Organisation organisation=applicationContext.getBean(Organisation.class);
        System.out.println(organisation);
    }
}
