package share_surprises.containers;

import share_surprises.surprisesTypes.ISurprise;

import java.util.ArrayList;

public abstract class AbstractBag implements IBag {
	
	private ArrayList<ISurprise> bag = new ArrayList<>();
	
	
	public ArrayList<ISurprise> getBag() {
		return this.bag;
	}
	
	@Override
	public void put(ISurprise surprise) {
		this.bag.add(surprise);
	}
	
	@Override
	public void put(IBag bagOfSurprises) {
		AbstractBag anotherBag = (AbstractBag) bagOfSurprises;
        this.bag.addAll(anotherBag.getBag());
        anotherBag.getBag().clear();
	}
	
	
	@Override
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	@Override
	 public int size() {
		 return this.bag.size();
	 }

	 @Override
	public void print(){
		for (int i = 0; i < this.bag.size(); i++){
			System.out.print(this.bag.get(i) + " ");
		}
		 System.out.println();
	 }
	 
	
	// public abstract ISurprise takeOut();
}
