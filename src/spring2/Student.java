package spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	List<String> skills;
	Set<String>mobiles;
	Map<String,String>marks;
	
	

	@Override
	public String toString() {
		return "Student [skills=" + skills + ", mobiles=" + mobiles + ", marks=" + marks + "]";
	}
	public Student(List<String> skills, Set<String> mobiles, Map<String, String> marks) {
		super();
		this.skills = skills;
		this.mobiles = mobiles;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}
	
	
}
