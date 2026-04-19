import java.util.Comparator;

public class MyCompareByMarks implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.marks - o2.marks;
	}

}
