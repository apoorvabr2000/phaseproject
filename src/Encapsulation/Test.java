package Encapsulation;

public class Test {
	public static void main (String[] args)  
    { 
        User obj = new User(); 
        obj.setName("Jerry"); 
        obj.setAge(20); 
        obj.setRoll(221); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 
}

