package io.javabrains.lambdas.functional;

import java.util.function.BiConsumer;
/*
 * This is program for using lambda expressions. 
 * Uses builtin Funtional Interfaces
 */

public class TestFunctionalLambdas {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6};
		int key = 20;
		
		perform(numbers,key, (u,v)->System.out.println(u+v));		
		
	}

	private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> cons) {
		for(int i:numbers) {
			cons.accept(i, key);
		}
		
	}
	

}

