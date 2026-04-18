package demo;

import java.util.Comparator;

public class MyMarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.marks-s2.marks;
	}

}
