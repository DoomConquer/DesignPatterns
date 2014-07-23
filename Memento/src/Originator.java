import java.util.Map;
import java.util.HashMap;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.beans.Introspector;
import java.lang.reflect.Method;
public class Originator {
	private String name;
	private Integer age;
	private Boolean isMember;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setIsMember(Boolean isMember) {
		this.isMember = isMember;
	}

	public String getName() {
		return (this.name);
	}

	public Integer getAge() {
		return (this.age);
	}

	public Boolean getIsMember() {
		return (this.isMember);
	}

	public Memento createMemento(){
		return new Memento(BeanUtils.pack(this));
	}

	public void restoreMemento(Memento memento){
		BeanUtils.unpack(this,memento.getMap());
	}

	public String toString(){
		return "Name: "+name+" Age: "+age+" Member: "+ isMember.toString();
	}
}

class BeanUtils{
	public static Map<String,Object> pack(Object bean){
		Map<String,Object> map=new HashMap<String,Object>();
		try{
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] propertyDescriptor=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor propDesc : propertyDescriptor){
				String fieldName=propDesc.getName();
				Method getter=propDesc.getReadMethod();
				Object fieldValue=getter.invoke(bean);
				if(!fieldName.equalsIgnoreCase("class"))
					map.put(fieldName,fieldValue);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}

	public static void unpack(Object bean,Map<String,Object>map){
		try{
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] propertyDescriptor=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor propDesc : propertyDescriptor){
				String fieldName=propDesc.getName();
				if(map.containsKey(fieldName)){
					Method setter=propDesc.getWriteMethod();
					Object fieldValue=setter.invoke(bean,map.get(fieldName));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}