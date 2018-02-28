import java.util.Arrays;

public class ClassTimes {
	Integer[] dayTime; //
	ClassTimes(Integer[] dT){
		assert(dT.length == 3); //ensures we have an array with three
								//values, {day, startTime, endTime};
		dayTime = dT;
		
	}
	
	//self explanatory helper/ access functions
	Integer getDay() {
		return dayTime[0];
	}
	
	Integer getStart() {
		return dayTime[1];
	}
	
	Integer getEnd() {
		return dayTime[2];
	}
	
	Integer[] getTimes() {
		return Arrays.copyOfRange(dayTime, 1, 3);
	}
}
