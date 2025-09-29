package com.company.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadSafeFormatter{
	
	static ThreadLocal<SimpleDateFormat> dateFormatter =  new ThreadLocal<SimpleDateFormat>() {
		
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}
		
		@Override
		public SimpleDateFormat get() {
			return super.get();
		};
	};
}
public class ThreadLocalDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		new Thread(()->{
			System.out.println(getBirthDate(100));
		}).start();
		
		new Thread(()->{
			System.out.println(getBirthDate(100));
		}).start();
		
		Thread.sleep(1000);
	}

	private static String getBirthDate(int userId) {
		
		Date birthDate = birthDateFromDB(userId);
		final SimpleDateFormat formatter = ThreadSafeFormatter.dateFormatter.get();
		
		return formatter.format(birthDate);		
		
	}

	private static Date birthDateFromDB(int userId) {
		
		//List<Date> dates = new ArrayList<>();
		//dates.add(new Date("26-07-1992"));
		if(userId == 100)
			return new Date();
		
		return null;
	}

}
