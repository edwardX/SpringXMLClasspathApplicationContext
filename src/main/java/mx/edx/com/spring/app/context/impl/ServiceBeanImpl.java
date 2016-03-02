package mx.edx.com.spring.app.context.impl;

import mx.edx.com.spring.app.context.ServiceBean;
import org.springframework.stereotype.Service;

/**
 *
 * @author edx
 * In this Class we implement ServiceBean Interface and
 * we declare it will as a Bean with @Service annotation
 */
@Service("ServiceBean")
public class ServiceBeanImpl implements ServiceBean{

    @Override
    public String wordToUpperCase(String word) {
        return word.toUpperCase();
    }
    
}
