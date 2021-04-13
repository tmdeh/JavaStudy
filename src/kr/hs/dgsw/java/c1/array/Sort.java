package kr.hs.dgsw.java.c1.array;

import java.util.Random;

public class Sort {

	private static final int SIZE = 100;
	
	private int[] array = new int[SIZE];
	
	public void fillValues() {
		Random random = new Random();
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = random.nextInt(10000);
		}
	}
	
	public void sort() {
		for(int i = 0; i <= array.length-1; i++) { //선택
			for(int j = i + 1; j <= array.length-1; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public void print() {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(i + " : " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.fillValues();
		
		System.out.println("정렬 전");
		sort.print();
		
		sort.sort();
		
		System.out.println("정렬 후");
		sort.print();
	}
}