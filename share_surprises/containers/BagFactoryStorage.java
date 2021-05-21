package share_surprises.containers;

public class BagFactoryStorage implements IBagFactory{
	
	@Override
	public IBag makeBag(String type) {
		if (type.equals("RANDOM")) {
			return new RandomContainer();
		} else if (type.equals("LIFO")) {
			return new LIFOContainer();
		} else if (type.equals("FIFO")) {
			return new FIFOContainer();
		}
		return null;
	}
	
}
