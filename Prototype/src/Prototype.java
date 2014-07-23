import java.util.ArrayList;
import java.io.*;

public class Prototype implements Cloneable{
	private ArrayList<Integer> list=new ArrayList<Integer>();
	public Prototype clone(){
		Prototype prototype=null;
		try{
			prototype=(Prototype)super.clone();            //Object��clone()������ǳ����
			prototype.list = (ArrayList) this.list.clone();   //ʵ��ArrayList�����
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
//ͨ�����л���������ʵ�ֿ���(���)��Object���clone()����ͨ�����ط��������ڴ��ж���
public class Prototype implements Cloneable, Serializable{
//����ʵ��Serializable�ӿڣ�����writeObject���쳣
	private ArrayList list=new ArrayList();
	public Prototype clone(){
  		Prototype prototype=null;
  		try{
	        //д�뵱ǰ����Ķ�������
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(bos);
	        oos.writeObject(this);

	        // �������������������¶���
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