package Design_Pattern_Assignments;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getSingleton();
        obj.setMessage("this is obj1");
        System.out.println(obj.getMessage());
        Singleton obj1 = Singleton.getSingleton();
        System.out.println(obj1.getMessage());
    }
}
