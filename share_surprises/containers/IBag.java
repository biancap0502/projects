package share_surprises.containers;

import share_surprises.surprisesTypes.ISurprise;

public interface IBag {
	
	 // adds a surprise in the bag
	  void put(ISurprise newSurprise);
	 
	  // adds all the surprises from another IBag
	  //   -> the 'bagOfSurprises' will be empty() afterwards
	  void put(IBag bagOfSurprises);
	 
	  // removes a surprise from the bag and returns it
	  ISurprise takeOut();
	 
	  // Checks if the bag is empty or not
	  boolean isEmpty();
	 
	  // Returns the number of surprises
	  int size();

	  // Prints the content of the bag
	  void print();






	  
	 
	 // ArrayList<ISurprise> getBag();

}
