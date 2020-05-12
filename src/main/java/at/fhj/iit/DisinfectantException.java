package at.fhj.iit;
/**
This Exception is thrown when the user drinks from a drink with over 90% alcoholic content
 */
public class DisinfectantException extends Exception{

    /**
     * Constructor without error message
     */
    public DisinfectantException(){
        super();
    }

    /**
     * Constructor with a error message
     * @param errorMessage
     */
    public DisinfectantException(String errorMessage) {
        super(errorMessage);
    }
}
