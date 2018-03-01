
public class ClassInfo {
	Integer courseID;			//ID for the course, going from 0 to N-1 for N classes
	Integer roomID;				//Room Number, modified for wings and buildings.
	CourseTimes classTime;  //values for class times and days
	String instructor; 		//instructors name
	boolean isLab;			//is this a lab?--on top of this we need to discern what kind
							//of lab this is i.e. bio, chemistry, physics. 
	Integer labType; 
							//figure we can make an integer variable for labtypes 
							//for this purpose 
							//1: physics
							//2: chemistry
							//3: biology
	Integer amountStudents; // How many students does the professor expect? if the 
							//system is fancy we could pull from CRS but seems unlikely

	
	ClassInfo(Integer cID, Integer rID, CourseTimes cT, String in, boolean lab, Integer type, Integer amtStud){
		this.courseID = cID;
		this.roomID = rID;
		this.classTime = cT;
		this.instructor = in;
		this.isLab = lab;
		this.labType = type;
		this.amountStudents = amtStud;
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
	Integer getLabType(){
		return this.labType;
	}

	Integer getAmountStudents(){
		return this.amountStudents;
	}
}
