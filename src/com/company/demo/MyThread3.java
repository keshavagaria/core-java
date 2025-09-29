package com.company.demo;


class T1 extends Thread{
	
	public void run() {
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

class T2 implements Runnable{

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("The value of current thread is "+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
public class MyThread3 {

	public static void main(String[] args) {
		
		T1 t1=new T1();
		t1.start();
		
		T2 t2=new T2();
		Thread thread=new Thread(t2);
		thread.start();
	}
	
}
