package com.coding.hackerrank;
import java.util.*;

class JavaStack {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();

			Stack<String> stack = new Stack<>();

			String[] str = input.split("");

			if (str[0].equals("(") || str[0].equals("[") || str[0].equals("{")) {
				stack.add(str[0]);
			} else {
				System.out.println("false");
				continue;
			}

			for (int i=1; i< str.length; i++) {
				if (str[i].equals(("(")) || str[i].equals(("[")) || str[i].equals(("{"))) {
					stack.add(str[i]);
					continue;
				}
				
				if (stack.isEmpty()) {
					stack.add(str[i]);
					continue;
				}

				if (stack.peek().equals("(") && str[i].equals(")")) {
					stack.pop();
				} else if (stack.peek().equals("[") && str[i].equals("]")) {
					stack.pop();
				} else if (stack.peek().equals("{") && str[i].equals("}")) {
					stack.pop();
				} else {
					stack.add(str[i]);
				}
			}

			if (stack.isEmpty()) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
		}
	}
}