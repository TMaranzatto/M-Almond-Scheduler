
public class ClassInfo {
	Integer courseID;			//ID for the course, going from 0 to N-1 for N classes
	Integer roomID;				//Room Number, modified for wings and buildings.
	CourseTimes classTime;  //values for class times and days
	String instructor; 		//instructors name
	boolean isLab;			//is this a lab?
	
	ClassInfo(Integer cID, Integer rID, CourseTimes cT, String in, boolean lab){
		this.courseID = cID;
		this.roomID = rID;
		this.classTime = cT;
		this.instructor = in;
		this.isLab = lab;
	}
	
	Integer getCourseID(){
		return this.courseID;
	}
	
	Integer getRoomID() {	
		return this.roomID;
	}
	
	CourseTimes getClassTimes() {
		return this.classTime;
	}
	
	String getInstructor() {
		return this.instructor;
	}
	
	boolean isLab() {
		return this.isLab;
	}
}
