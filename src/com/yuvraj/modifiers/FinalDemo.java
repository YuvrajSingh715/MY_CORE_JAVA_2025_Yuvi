package com.yuvraj.modifiers;

class FinalDemo {

	public void property() {
		System.out.println("money " + "," + "gold " + "," + "land");
	} // this method can be override because this method is not final

	public final void marry() {
		System.out.println("Girls");
	} // this method can't be override because this method is final

}
