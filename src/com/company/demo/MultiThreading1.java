package com.company.demo;

//using Thread class
class Test extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Value of i is "+i);
			
			try{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading1 {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.start();
		
	}
}
