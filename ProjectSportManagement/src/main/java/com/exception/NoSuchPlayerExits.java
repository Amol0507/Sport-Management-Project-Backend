package com.exception;

public class NoSuchPlayerExits extends RuntimeException{
	
	String msg;

	public NoSuchPlayerExits() {
		super();
	}

	public NoSuchPlayerExits(String msg) {
		super();
		this.msg = msg;
		System.out.println(msg);
	}
	
	

}
