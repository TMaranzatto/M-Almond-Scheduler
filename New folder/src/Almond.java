
public class Almond implements Algorithm {
	ProfessorPreference[] preferences; //array of all professor preferences
	boolean[][] conflicts;  //2d array of classes that cannot overlap. 
						//will figure out how to generate later
	Almond(ProfessorPreference[] data, boolean[][] c){
		this.preferences = data;
		this.conflicts = c;
	}
	
	public ClassInfo[] getSchedule(ProfessorPreference[] preferences) {
		
		
		return null;
	}
}
