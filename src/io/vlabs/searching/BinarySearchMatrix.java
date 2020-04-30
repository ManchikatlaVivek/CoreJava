package io.vlabs.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearchMatrix {
	public static void main(String args[]) throws Exception {
		System.out.println("Enter the input as follows\n" + "rows(m) and columns(n)\n"
				+ "m rows with n space separated integers in each line");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().trim().split(" ");
		int rows = Integer.parseInt(line1[0]);
		int cols = Integer.parseInt(line1[1]);
		int[][] nums = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			String[] row = br.readLine().trim().split(" ");
			for (int j = 0; j < row.length; j++) {
				nums[i][j] = Integer.parseInt(row[j]);
			}
		}
		System.out.println("Binary Search each element of Matrix");
		int total = rows * cols;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				boolean ans = getSolution(nums, 0, total - 1, nums[i][j]);
				if (!ans) {
					System.out.println(nums[i][j] + " Element not Found");
				}
			}
		}
		System.out.println("Binary Search the lower bound");
		boolean ans = getSolution(nums, 0, total - 1, 0);
		if (!ans) {
			System.out.println("-1 -1");
		}
		System.out.println("Binary Search the upper bound");
		ans = getSolution(nums, 0, total - 1, 100);
		if (!ans) {
			System.out.println("-1 -1");
		}

	}

	public static boolean getSolution(int[][] nums, int low, int high, int key) {
		if (low <= high) {
			int mid = low + (high - low) / 2;
			int cols = nums[0].length;
			int i = getX(mid, cols);
			int j = getY(mid, cols);
			System.out.println(i + " " + j);
			if (nums[i][j] == key) {
				System.out.println(key + ":Element Found");
				return true;
			} else if (nums[i][j] < key) {
				return getSolution(nums, mid + 1, high, key);
			} else {
				return getSolution(nums, low, mid - 1, key);
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
