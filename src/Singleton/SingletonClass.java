package Singleton;

class SingletonClass {
    private static SingletonClass singletonClassInstance;
    private SingletonClass() {
    }

    public static SingletonClass getSingletonClassInstance() {
        if(singletonClassInstance==null) {
            synchronized (SingletonClass.class) {
                if(singletonClassInstance==null) {
                    singletonClassInstance = new SingletonClass();
                }
            }
        }
        return singletonClassInstance;
    }
}