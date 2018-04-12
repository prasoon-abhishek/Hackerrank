package hackerrank.java.data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		System.out.println("Enter num of testcases:");
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		System.out.println("enter " + testCases + " students");
		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname)
				.thenComparing(Student::getId));

		// Collections.sort(studentList, new Checker());

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}

		in.close();
	}
}

class Checker implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getCgpa() == o2.getCgpa())
			return (o2.getFname().compareTo(o1.getFname()));
		else if (o1.getFname() == o2.getFname())
			return o2.getId() - o1.getId();
		else
			return (int) (o2.getCgpa() - o1.getCgpa());
	}

}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}
