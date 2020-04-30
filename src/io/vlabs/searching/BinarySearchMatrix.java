package io.vlabs.searching;

public class BinarySearchMatrix {
	public static void main(String args[]) throws Exception {
		System.out.println("Hello World");
		int[][] nums = { { 1, 5, 7 }, { 11, 15, 17 }, { 31, 34, 39 }, { 43, 56, 98 } };
		boolean ans = getSolution(nums, 0, 12, 100);
		if(!ans) {
			System.out.println("-1 -1");
		}
		
	}

	public static boolean getSolution(int[][] nums, int low, int high, int key) {
		if (low < high) {
			int mid = (low + high) / 2;
			int cols = nums[0].length;
			int i = getX(mid, cols);
			int j = getY(mid, cols);
			System.out.println(i + " " + j);
			if (nums[i][j] == key) {
				System.out.println("Element Found");
				return true;
			} else if (nums[i][j] < key) {
				getSolution(nums, mid, high, key);
			} else {
				getSolution(nums, low, mid, key);
			}
		}
		return false;

	}

	public static int getX(int num, int cols) {
		return num / cols;
	}

	public static int getY(int num, int cols) {
		return num % cols;
	}
}
