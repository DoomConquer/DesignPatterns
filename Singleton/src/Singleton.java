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
//�ڲ���ʵ�ֵĵ���ģʽ
public class Singleton {

    // ˽�й��췽������ֹ��ʵ����
    private Singleton() {
    }
    // �˴�ʹ��һ���ڲ�����ά������
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }
    // ��ȡʵ��
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }
    // ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
    public Object readResolve() {
        return getInstance();
    }
    public void doSomething(){
    	System.out.println("This is a singleton.");
    }
}

//Ӱ��ʵ��ʵ�ֶԵ����������Ե�ͬ������
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