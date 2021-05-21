package share_surprises.shareSurprises;

import share_surprises.containers.BagFactoryStorage;
import share_surprises.containers.IBag;
import share_surprises.surprisesTypes.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	
	private IBag bag;
	private int waitTime;
	
	public AbstractGiveSurprises(String type, int waitTime) {
		this.bag = new BagFactoryStorage().makeBag(type);
		this.waitTime = waitTime;
	}
	
	public IBag getBag() {
		return this.bag;
	}
	
	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	public void give() {
		if (!this.bag.isEmpty()) {
			this.bag.takeOut().enjoy();
			this.giveWithPassion();
		} else {
			System.out.println("Empty bag");
		}
	}
	
	public void giveAll() {
		if (this.bag.isEmpty()) {
			System.out.println("Empty bag");
		}
		while(!this.bag.isEmpty()) {
			this.bag.takeOut().enjoy();
			this.giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(waitTime);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}

	}
	
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	public int size(){
		return this.bag.size();
	}
	
	// metoda vizibila doar in cadrul pachetului si pe lantul de mostenire
	protected abstract void giveWithPassion();
		
	
	

}
