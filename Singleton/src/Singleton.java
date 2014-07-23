public class Singleton {
    private static Singleton instance=null;
    private Singleton(){
    }
    private static synchronized void syncInitSigleton(){
    	if(instance==null){
    		instance=new Singleton();
    	}
    }
    public static Singleton getInstance(){
    	if(instance==null){
    		syncInitSigleton();
    	}
    	return instance;
    }
    public Object readResolve(){
    	return instance;
    }
    public void doSomething(){
    	System.out.println("This is a singleton.");
    }
}

/*
//内部类实现的单例模式
public class Singleton {

    // 私有构造方法，防止被实例化
    private Singleton() {
    }
    // 此处使用一个内部类来维护单例
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }
    // 获取实例
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }
    // 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {
        return getInstance();
    }
    public void doSomething(){
    	System.out.println("This is a singleton.");
    }
}

//影子实例实现对单例对象属性的同步更新
public class Singleton {
    private static Singleton instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }
    private Singleton() {
    }
    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }
    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
	public void doSomething(){
    	System.out.println("This is a singleton.");
    }
    public void updateProperties() {
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }
}          */