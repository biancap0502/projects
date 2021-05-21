package share_surprises.shareSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
	
	public GiveSurpriseAndHug(String type,int waitTime) {
		super(type, waitTime);
	}
	
	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}

}
