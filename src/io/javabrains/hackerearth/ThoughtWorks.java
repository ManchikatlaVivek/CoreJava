package io.javabrains.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThoughtWorks {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the input String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] line = br.readLine().split(";;;");
		for(String item : line) {
			String [] list = item.split(",");
			int sum = 0;
			for(String s : list) {
//				System.out.println(s);
				sum += Integer.parseInt(s);
			}
			int num = getPoolNumber(sum);
			System.out.println("Pool Number value is " + num);
		}
		
	}
	
	static int getPoolNumber(int sum) {
		if(sum<10) {
			return sum;	
		}
		int sumOfSum = 0;
		while(sum>0) {
			sumOfSum += sum%10;
			sum = sum/10;
		}
		return getPoolNumber(sumOfSum);
		
	}

}
