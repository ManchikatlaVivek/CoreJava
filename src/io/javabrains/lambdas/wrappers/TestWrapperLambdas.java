package io.javabrains.lambdas.wrappers;

import java.util.function.BiConsumer;

/*
 * This program demonstrates the usage of lambdas for Wrapping lambdas.
 */
public class TestWrapperLambdas {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6};
		int key = 3;
		
		perform(numbers,key,wrapperLambda((u,v)->System.out.println(u/v)));
	}

	private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> cons) {
		for(Integer i : numbers) {
			cons.accept(i, key);
		}
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> cons) {
		return (u,v)->{try {
			cons.accept(u, v);
		}catch(Exception e) {
			System.out.println("This is an error");
		}
	};
	}

}
