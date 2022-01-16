package com;

public class MethodOverloading {
    void display(int age) {
    	System.out.println("Age:"+age);
    }
    void display(String name) {
    	System.out.println("Name:"+name);
    }
    void display(int id,double height) {
    	System.out.println("Height:"+height+" Id:"+id);
    }
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.display("Dinga");
		obj.display(25);
		obj.display(101,5.7);

	}

}
