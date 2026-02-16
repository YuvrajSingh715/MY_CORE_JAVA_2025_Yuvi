package com.Google.garbage_collector;

public class E4FinalizeDemo {
	
	static E4FinalizeDemo fd;
	
	public static void main(String [] args) throws Exception {
		
		E4FinalizeDemo efd = new E4FinalizeDemo();
		
		System.out.println("hashCode of efd: "+efd.hashCode());
		
		efd = null;
		
		System.gc();
		
		Thread.sleep(4000);
		
		if(fd != null) {
			System.out.println("hashCode of fd: " + fd.hashCode());
		}else {
			System.out.println("fd's value is null");
		}
		
		fd = null;
		
		System.gc();
		
		Thread.sleep(4000);
		
		System.out.println("End of main method.");
		
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize method called.");
		fd = this;
	}

}
