package share_surprises.surprisesTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise{
	
	private String minionName;
	private static final ArrayList<String> minionsNames =
			new ArrayList<String>(Arrays.asList("Dave","Karl","Kevin","Stuart","Jerry","Tim"));
	private static int counter = 0;
	
	
	public MinionToy(String minionName) {
		this.minionName = minionName;
	}
	
	public String getMinionName() {
		return this.minionName;
	}
	
	public static MinionToy generate() {
		if (counter == minionsNames.size()){
			counter = 0;
		}
		if (counter < minionsNames.size()){
			String minionOrder = minionsNames.get(counter++);
			MinionToy minionToy = new MinionToy(minionOrder);
			return minionToy;
		}
		return null;
	}
	
	@Override
	public void enjoy() {
		System.out.print("Congrats! You have a new fiend. Your minion's name is: " + this.minionName + "\n");
	}

	@Override
	public String toString(){
		return "Your minion's name is: " + this.minionName + "\n";
	}

}
