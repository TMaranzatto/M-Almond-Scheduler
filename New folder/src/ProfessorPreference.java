import java.util.ArrayList;

public class ProfessorPreference {
	ClassInfo[] preferences;
	
	ProfessorPreference(ClassInfo[] p){
		this.preferences = p;
	}
	
	ClassInfo[] getPreferences() {	
		//returns all preferences
		return this.preferences;
	}
	
	ClassInfo getPreference(int index) {
		//returns the specific preference
		return this.preferences[index];
	}
	
	Integer[] getClasses() {
		//returns all unique classes the professor will like to teach
		ArrayList<Integer> uniqueClasses = new ArrayList<Integer>();
		for(ClassInfo c : preferences) {
			if (uniqueClasses.contains(c.getCourseID()) == false){
				uniqueClasses.add(c.getCourseID());
			}
		}
		return uniqueClasses.toArray(new Integer[0]);
	}
	
	ClassInfo[] getSingleClassPreference(int cID) {
		ArrayList<ClassInfo> singlePreference = new ArrayList<ClassInfo>();
		for(ClassInfo c : preferences) {
			if(c.getCourseID() == cID) {
				singlePreference.add(c);
			}
		}
		return singlePreference.toArray(new ClassInfo[0]);
		
	}
}
