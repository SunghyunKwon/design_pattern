import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Instance Start.");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance(); 

        if (singleton1 == singleton2) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        System.out.println("End");
    }
}