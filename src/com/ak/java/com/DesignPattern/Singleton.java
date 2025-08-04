package com.ak.java.com.DesignPattern;

public class Singleton {

	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

// this is early loading singlton method
//        if (singleton == null){
//            return singleton =  new Singleton();
//        }
//        return singleton;
//    }

		// use for lazy loading (double lock checking)
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					return singleton = new Singleton();
				}
			}
		}

		return singleton;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
	}
}
