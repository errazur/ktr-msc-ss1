public class WaeponException extends Exception {

    public WaeponException() {
        System.out.println("I refuse to fight with my bare hands.");
    }

    public WaeponException(String message) {
        super(message);
    }
    
}
