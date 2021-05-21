package share_surprises.surprisesTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	
	
	private String candyType;
	private int candiesNo;
	private static final ArrayList<String> listOfCandies = new ArrayList<String>
			(Arrays.asList("chocolate","jelly","fruits","vanilla"));
	private static final int maxNoOfCandies = 50;
	
	public Candies(String candyType,int candiesNo) {
		this.candyType = candyType;
		this.candiesNo = candiesNo;
	}
	
	public static Candies generate() {
		Random random = new Random();
		int rCandyType = random.nextInt(listOfCandies.size());
		int rCandiesNo = random.nextInt(maxNoOfCandies) + 1;
		return new Candies(listOfCandies.get(rCandyType),rCandiesNo);
	}
	
	
	public String getCandyType() {
		return this.candyType;
	}
	
	public int getCandiesNo() {
		return this.candiesNo;
	}

	@Override
	public void enjoy() {
		System.out.print("Congrats! You've received: " + this.candiesNo + " candies made of: " + this.candyType + "\n");
	}

	@Override
	public String toString(){
		return "Number of candies: " + this.candiesNo + " and type of candies: " + this.candyType + "\n";
	}

}
