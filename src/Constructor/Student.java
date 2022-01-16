package Constructor;

public class Student {
	int id;
	String name;
  Student(int i,String n){
	  id=i;
	  name=n;
  }
  void display() {
	  System.out.println(id+" "+name);
  }
	public static void main(String[] args) {
		Student std1=new Student(101,"Tom");
		Student std2=new Student(102,"Jack");
		std1.display();
		std2.display();
    }

}
