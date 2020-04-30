/*
 * @author Vivek Manchikatla
 *  #VLabs Solutions Pvt Ltd.
 *  @Teacher : Tushar Roy -- Youtube Link -->  https://www.youtube.com/watch?v=nYFd7VHKyWQ
 *  
 */
package io.vlabs.permutations;

public class PrintAllPermutations {

	public static void main(String[] args) {
		
		char [] nums = {'a','b','c','d'};
		int [] freq = {1,1,1,1};
		char [] result = new char[4];
		printAllPermutations(nums,freq,result,0);

	}

	private static void printAllPermutations(char[] nums, int[] freq, char[] result, int level) {
		if(level==nums.length) {
			printArray(result);
			return;
		}		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==0) {
				continue;
			}
			result[level]=nums[i];
			freq[i]--;
			printAllPermutations(nums, freq, result, level+1);
			freq[i]++;			
		}
		
	}

	private static void printArray(char[] result) {
		for(char ch:result) {
			System.out.print(ch+" ");
		}
		System.out.println();
		
	}

	
}
