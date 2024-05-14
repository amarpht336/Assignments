
public class Singleton {

    private static Singleton obj;
    private String message;

    private Singleton() {
    }

    // method to return single object of singleton class

    public static Singleton getSingleton() {
        // if object is null create one if not return existing object
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}