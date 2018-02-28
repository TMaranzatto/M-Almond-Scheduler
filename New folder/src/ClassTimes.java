import java.util.Arrays;

public class ClassTimes {
	int[] dayTime;
	ClassTimes(int[] dT){
		dayTime = dT;
		
	}
	
	int getDay() {
		return dayTime[0];
	}
	
	int[] getTimes() {
		return Arrays.copyOfRange(dayTime, 1, 3);
	}
}
