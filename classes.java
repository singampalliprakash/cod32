package com.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	private int id;
	private String name;
	private double salary;
}
public class Main 
{
	
	public static void main(String[] args) 
	{
		Repostory repostory=new Repostory();
		repostory.ord2(); 
	}
}


class Controller
{
	Employee e=new Employee(101,"prakash",25000);
	Employee ord() 
	{
		return e;
	}
}
class Service {
	Controller controller=new Controller();
	Employee e=controller.ord();
	Employee ord1()
	{
		return e;
	}
}

class Repostory 
{
	Service service=new Service();
	Employee e=service.ord1();
	void ord2() 
	{
		System.out.println(e);
	}
}

