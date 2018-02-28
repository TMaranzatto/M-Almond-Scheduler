public class CourseTimes {
	ClassTimes[] meetingTimes;
	
	CourseTimes(ClassTimes[] mT){
		this.meetingTimes = mT;
	}
	
	ClassTimes getClass(int index){
		return meetingTimes[index];
	}
}
