package com.example.demo;

public class ComparatorNew {

	public static boolean compare(int a, int b) {
		return a == b;
	}

	public static boolean compare(String a, String b) {
		return a.equals(b);
	}

	public static boolean compare(int[] a, int[] b) {

		boolean result = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return false;
				}
			}
		}
		return result;
	}

	public static String printResult(boolean b) {

		if (b)
			return "Same";
		return "Different";

	}

	public static void main(String argsp[]) {
		System.out.println(printResult(compare(1, 1)));
		System.out.println(printResult(compare("Bhanu", "test")));
		System.out.println(printResult(compare(new int[] { 0, 0, 0 }, new int[] { 0, 0, 0 })));
	}
}
