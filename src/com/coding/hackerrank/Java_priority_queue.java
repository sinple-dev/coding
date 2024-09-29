package com.coding.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	// o.cgpa = 10
	// this.cgpa = 5
	@Override
	public int compareTo(Student o) {
		// if (o.cgpa != this.cgpa) return this.cgpa - o.cgpa > 0 ? 1 : -1;
		if (o.cgpa != this.cgpa) return (o.cgpa - this.cgpa > 0) ? 1 : -1;
		else {
			if (!this.name.equals(o.name)) {
				return this.name.compareTo(o.name);
			}
			else {
				return this.id - o.id;
			}
		}
	}
}

class Priorities {
	PriorityQueue<Student> pq = new PriorityQueue<>();
	public List<Student> getStudents(List<String> events) {

		for (int i =0; i< events.size(); i++) {

			String[] s = events.get(i).split(" ");
			if (s[0].equals("ENTER")) {
				pq.add(new Student(Integer.parseInt(s[3]), s[1], Double.parseDouble(s[2])));
			} else {
				if (!pq.isEmpty()) {
					pq.poll();
				}
			}
		}

		List<Student> students = new ArrayList<>();
		while (!pq.isEmpty()) {
			students.add(pq.poll());
		}
		return students;

		//힙 구조에서 요소들이 완전히 정렬되지 않은 상태가 발생하는 이
		// return new ArrayList<>(pq);

	}
}

class Java_priority_queue {

	private final static Priorities priorities = new Priorities();

	private final static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st: students) {
				System.out.println(st.getName());
			}
		}
	}


}