package com.Google.multithreading;

public class SettingAndGetting {

	public static void main(String[] args) {

		System.out.println("Old Thread Name: " + Thread.currentThread().getName());

		Thread.currentThread().setName("Yuvi's_Thread");

		System.out.println("New Thread Name: " + Thread.currentThread().getName());

		System.out.println(Thread.currentThread());

	}

}
