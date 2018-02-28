
public class ClassInfo {
	int courseID;			//CRS ID for the course
	int roomID;				//Room Number, modified for wings and buildings.
	CourseTimes classTime; //should have two or three values for each day
							//class is held
							//as an example:
							//{0, 1300, 1390}, {2, 1300, 1390}, {4, 1300, 1390} 
							// is mon wed fri 1:00 to 1:50.
	String instructor; 		//instructors name
	boolean isLab;			//is this a lab?
	
	ClassInfo(int cID, int rID, CourseTimes cT, String in, boolean lab){
		this.courseID = cID;
		this.roomID = rID;
		this.classTime = cT;
		this.instructor = in;
		this.isLab = lab;
	}
}
