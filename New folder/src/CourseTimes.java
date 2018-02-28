public class CourseTimes {
	ClassTimes[] meetingTimes;  //should be a length of 2 or 3
								//{0, 1300, 1390}, {2, 1300, 1390}, {4, 1300, 1390} 
								// is Mon Wed Fri 1:00 to 1:50.
	
	CourseTimes(ClassTimes[] mT){
		this.meetingTimes = mT;
	}
	
	ClassTimes getClass(int index){
		return meetingTimes[index];
	}
}
