package uni.isw.designpatterns.singleton;

public class TestLogger {
    
    public static void main(String[] args){
        Logger logger=Logger.getInstance();
        logger.log("prueba");
        
        Logger logger_1=Logger.getInstance();
        Logger logger_2=Logger.getInstance();
        logger_1.setValue("prueba_1");
        System.out.println(logger_2.getValue());
    }
    
}
