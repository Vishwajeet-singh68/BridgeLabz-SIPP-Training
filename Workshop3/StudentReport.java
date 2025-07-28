package Workshop3;
import java.util.*;

public class StudentReport {
	Map<String, List<Integer>> map;
	public StudentReport() {
		// TODO Auto-generated constructor stub
		map=new HashMap<>();
	}
	
	public void addMark(String student, int mark) {
		if(!map.containsKey(student))
			map.put(student, new ArrayList<>());
		
		map.get(student).add(mark);
	}
	
	public double average(String student) {
		List<Integer> l=map.get(student);
		double sum=0,total=0;
		for(int i:l) {
			total++;
			sum+=i;
		}
		return sum/total;
	}
	
	public void getTopPerformer() {
		double max=-1;
		String topper="";
		for(String s:map.keySet()) {
			double avg=average(s);
			if(avg>max) {
				max=avg;
				topper=s;
			}
		}
		System.out.println(topper+" "+max);
	}
	
	public static void main(String[] args) {
		StudentReport s=new StudentReport();
		s.addMark("vishwajeet", 85);
		s.addMark("vishwajeet", 92);
		s.addMark("rahul", 99);
		s.addMark("rahul", 72);
		s.addMark("ritik", 89);
		s.addMark("ritik", 87);
		s.getTopPerformer();
	}
}
