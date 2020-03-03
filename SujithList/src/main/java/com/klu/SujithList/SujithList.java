package com.klu.SujithList;

public class SujithList {
	public static void main(String[] args) {
		Integer[] array= {10,20,30,40,50,60,70,80,90,100};
    	MyArrayList<Integer> list = new MyArrayList<Integer>(array);
    	list.add(20);
    	list.remove(10);
    	list.get(5);
    	list.print();
	}
}
