package mx.edx.com.spring.app.context;

/**
 * 
 * @author edx
 * This interface is where context in spring will scan as a Service Bean
 */
public interface ServiceBean {
    
    String wordToUpperCase(String word);
    
}
