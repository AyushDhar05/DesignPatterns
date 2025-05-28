package Singleton;

public class Client {
    public static void main(String... args) {
        SingletonClass singletonClass1 = SingletonClass.getSingletonClassInstance();
        SingletonClass singletonClass2 = SingletonClass.getSingletonClassInstance();

        if(singletonClass1==singletonClass2) {
            System.out.println("Both references are same.");
        } else {
            System.out.println("Both references are different! Singleton Implementaion has failed.");
        }
    }
}
