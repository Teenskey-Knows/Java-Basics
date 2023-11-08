class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

public class Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();  
		obj.setAge(11);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}


//Everytime you create a new object it calls the constructor.
// That's why in Angular, most times you define variables as parameters in the constructor (), so that each time something is created the constructor can provide the necessary variables.