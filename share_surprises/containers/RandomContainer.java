package share_surprises.containers;

import share_surprises.surprisesTypes.ISurprise;

import java.util.Random;

public class RandomContainer extends AbstractBag {
	
	@Override
	public ISurprise takeOut() {
		if (super.isEmpty()) {
			return null;
		}
		Random randomNumber = new Random();
		int randomIndex = randomNumber.nextInt(super.getBag().size());
		ISurprise removedSurprise = super.getBag().get(randomIndex);
		super.getBag().remove(randomIndex);
		return removedSurprise;
	}
	

}
