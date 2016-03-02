package mx.edx.com.spring.app.context;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author edx
 * JUnit Test for ServiceBean
 */
public class ServiceBeanTest {
    private ClassPathXmlApplicationContext ctx;
    ServiceBean serviceBean;

    public ServiceBeanTest() {
    }
    
    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("classpath:appconfig/servicesContext.xml");
        serviceBean = (ServiceBean) ctx.getBean("ServiceBean");
    }
  
     @Test
     public void TestService() {
        String wordToUpperCase = serviceBean.wordToUpperCase("spring servicebean sample");
        System.out.println(wordToUpperCase);
     }
}
