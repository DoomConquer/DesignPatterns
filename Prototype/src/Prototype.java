import java.util.ArrayList;
import java.io.*;

public class Prototype implements Cloneable{
	private ArrayList<Integer> list=new ArrayList<Integer>();
	public Prototype clone(){
		Prototype prototype=null;
		try{
			prototype=(Prototype)super.clone();            //Object中clone()方法，浅拷贝
			prototype.list = (ArrayList) this.list.clone();   //实现ArrayList的深拷贝
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return prototype;
	}

	public void showList(){
		for(int i=0;i<list.size();i++)
			System.out.println("list["+i+"] is "+list.get(i));
	}
	public void addList(int elem){
		list.add(elem);
	}
	public void doSomething(){
		System.out.println("This is a Prototype.");
	}
}

/*
//通过序列化二进制流实现拷贝(深拷贝)，Object类的clone()方法通过本地方法复制内存中对象
public class Prototype implements Cloneable, Serializable{
//必须实现Serializable接口，否则writeObject抛异常
	private ArrayList list=new ArrayList();
	public Prototype clone(){
  		Prototype prototype=null;
  		try{
	        //写入当前对象的二进制流
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(bos);
	        oos.writeObject(this);

	        // 读出二进制流产生的新对象
	        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream ois = new ObjectInputStream(bis);
	        prototype=(Prototype)ois.readObject();
  		}catch(IOException | ClassNotFoundException e){
  			e.printStackTrace();
  		}
        return prototype;
    }
	public void showList(){
		for(int i=0;i<list.size();i++)
			System.out.println("list["+i+"] is "+list.get(i));
	}
	public void addList(int elem){
		list.add(elem);
	}
	public void doSomething(){
		System.out.println("This is a Prototype.");
	}
}  */