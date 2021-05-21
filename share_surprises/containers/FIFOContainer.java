package share_surprises.containers;

import share_surprises.surprisesTypes.ISurprise;

public class FIFOContainer extends AbstractBag {
	
	@Override
	public ISurprise takeOut() {
		return super.getBag().remove(0);
	}
	


}
