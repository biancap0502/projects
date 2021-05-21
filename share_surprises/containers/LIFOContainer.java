package share_surprises.containers;

import share_surprises.surprisesTypes.ISurprise;

public class LIFOContainer extends AbstractBag {
	
	
	@Override
	public ISurprise takeOut() {
		return super.getBag().remove(super.getBag().size() - 1);
	}
	

}
