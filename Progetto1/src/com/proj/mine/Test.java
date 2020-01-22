package com.proj.mine;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("Flavio", 1986);
		System.out.println("Name: " + p.getName() + "\tAge: " + p.getAge());
		System.out.println(p);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
		}
	}

}
