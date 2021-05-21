package share_surprises.surprisesTypes;

public class Main {

	public static void main(String[] args) {
		
		// surprises: fortuneCookie, candy, minionToy
		System.out.println("---FORTUNE COOKIE---");
		FortuneCookie fortuneCookie1 = FortuneCookie.generate();
		fortuneCookie1.enjoy();
		ISurprise fortuneCookie2 = FortuneCookie.generate();
		fortuneCookie2.enjoy();
		ISurprise fortuneCookie3 = FortuneCookie.generate();
		fortuneCookie3.enjoy();
		ISurprise fortuneCookie4 = FortuneCookie.generate();
		fortuneCookie4.enjoy();
		
		System.out.println("---CANDIES---");
		Candies candy1 = Candies.generate();
		candy1.enjoy();
		ISurprise candy2 = Candies.generate();
		candy2.enjoy();
		ISurprise candy3 = Candies.generate();
		candy3.enjoy();
		ISurprise candy4 = Candies.generate();
		candy4.enjoy();
		
		System.out.println("---MINIONS---");
		MinionToy minion1 = MinionToy.generate();
		minion1.enjoy();
		ISurprise minion2 = MinionToy.generate();
		minion2.enjoy();
		ISurprise minion3 = MinionToy.generate();
		minion3.enjoy();
		ISurprise minion4 = MinionToy.generate();
		minion4.enjoy();
		ISurprise minion5 = MinionToy.generate();
		minion5.enjoy();
		ISurprise minion6 = MinionToy.generate();
		minion6.enjoy();
		ISurprise minion7 = MinionToy.generate();
		minion7.enjoy();
		
		// containers: randomContainer, FIFOContainer, LIFOContainer
		
		// RandomContainer
//		System.out.println("----RANDOM CONTAINER: randomContainer1----");
//
//		AbstractBag randomContainer1 = new RandomContainer();
//		randomContainer1.put(fortuneCookie1);
//		randomContainer1.put(candy2);
//		randomContainer1.put(minion2);
//		ArrayList<ISurprise> randomBag = randomContainer1.getBag();
//		for(ISurprise surprise: randomBag) {
//			surprise.enjoy();
//		}
//
//		System.out.println("Random container--> size: " + randomBag.size());
//		ISurprise removedSurprise = randomContainer1.takeOut();
//		System.out.print("Surprise that was removed:");
//		removedSurprise.enjoy();
//		System.out.println("Random container--> size: " + randomBag.size());
//
//		System.out.println("---RANDOM CONTAINER: randomContainer2:---");
//		AbstractBag randomContainer2 = new RandomContainer();
//		randomContainer2.put(candy2);
//		randomContainer2.put(fortuneCookie1);
//		randomContainer2.put(minion6);
//		ArrayList<ISurprise> randomBag2 = randomContainer2.getBag();
//		for(ISurprise surprise2: randomBag2) {
//			surprise2.enjoy();
//		}
//		System.out.println("Random container--> size: " + randomBag2.size());
//		randomContainer2.put(randomContainer1);
//		System.out.println("RandomContainer1 size: " + randomContainer1.size() + " " +
//							"RandomContainer2 size: " + randomContainer2.size());
//		for (ISurprise surprise2: randomBag2) {
//			surprise2.enjoy();
//		}
//
//		//FIFOContainer
//		System.out.println("--- FIFO CONTAINER: FIFOContainer1---");
//		AbstractBag fifoContainer1 = new FIFOContainer();
//		fifoContainer1.put(minion3);
//		fifoContainer1.put(candy4);
//		fifoContainer1.put(fortuneCookie3);
//		ArrayList<ISurprise> fifoBag = fifoContainer1.getBag();
//		for (ISurprise surprise: fifoBag) {
//			surprise.enjoy();
//		}
//
//		fifoContainer1.takeOut();
//		System.out.println("---FIFO bag after take out:---");
//		for (ISurprise surprise: fifoBag) {
//			surprise.enjoy();
//		}
//
//		//LIFOContainer
//		System.out.println("--- LIFO CONTAINER: LIFOContainer1---");
//		AbstractBag lifoContainer1 = new LIFOContainer();
//		lifoContainer1.put(minion5);
//		lifoContainer1.put(candy2);
//		lifoContainer1.put(fortuneCookie4);
//		ArrayList<ISurprise> lifoBag = lifoContainer1.getBag();
//		for (ISurprise surprise: lifoBag) {
//			surprise.enjoy();
//		}
//
//		lifoContainer1.takeOut();
//		System.out.println("---LIFO bag after take out:---");
//		for (ISurprise surprise: lifoBag) {
//			surprise.enjoy();
//		}
//
//		// GAHTHER SURPRISES
//		System.out.println("--- Gather surprises---");
//
//		System.out.println("--- Gather surprises: returns an array of n surprises:---");
//		ArrayList<ISurprise> gatheredSurprises = GatherSurprises.gather(7);
//		for (ISurprise surprise: gatheredSurprises) {
//			surprise.enjoy();
//		}
//
//		System.out.println("---Gather surprises: returns one surprise---");
//		ISurprise surpriseGathered1 = GatherSurprises.gather();
//		System.out.print("The surprise that was gathered: ");
//		surpriseGathered1.enjoy();
//		ISurprise surpriseGathered2 = GatherSurprises.gather();
//		System.out.print("The surprise that was gathered: ");
//		surpriseGathered2.enjoy();
//		ISurprise surpriseGathered3 = GatherSurprises.gather();
//		System.out.print("The surprise that was gathered: ");
//		surpriseGathered3.enjoy();
//
//		// create container
//		System.out.println("--- Create new container---");
//		IBag otherContainer = new BagFactoryStorage().makeBag("LIFO");
//		ArrayList<ISurprise> otherSurprise = otherContainer.getBag();
//		otherContainer.put(surpriseGathered1);
//		otherContainer.put(surpriseGathered2);
//		otherContainer.put(surpriseGathered3);
//
//		for (ISurprise surprise: otherSurprise) {
//			surprise.enjoy();
//		}
//
//		System.out.println("Other container size: " + otherContainer.size());
//		otherContainer.takeOut();
//		System.out.println("--Other container after take out--");
//		for (ISurprise surprise: otherSurprise) {
//			surprise.enjoy();
//		}
//
//		// give surprises and applause
//		System.out.println("-- Give surprises and applause: type: random--");
//		GiveSurpriseAndApplause giveSA1 = new GiveSurpriseAndApplause("RANDOM",12);
//		giveSA1.put(minion3);
//		giveSA1.put(fortuneCookie1);
//		giveSA1.put(GatherSurprises.gather());
//		ArrayList<ISurprise> giveSA = giveSA1.getBag().getBag();
//		for (ISurprise surprise: giveSA) {
//			surprise.enjoy();
//		}
//		System.out.println("Size of bag: " + giveSA.size());
//		System.out.println("---GIVE---");
//		giveSA1.give();
//		System.out.println("---GIVE ALL---");
//		giveSA1.giveAll();
//
//		// give surprises and hug
//		System.out.println("-- Give surprises and hug: type: FIFO--");
//		GiveSurpriseAndHug giveSH1 = new GiveSurpriseAndHug("FIFO",12);
//		giveSH1.put(minion4);
//		giveSH1.put(fortuneCookie2);
//		giveSH1.put(GatherSurprises.gather());
//		ArrayList<ISurprise> giveSH = giveSH1.getBag().getBag();
//		for (ISurprise surprise: giveSH) {
//			surprise.enjoy();
//		}
//		System.out.println("Size of bag: " + giveSH.size());
//		System.out.println("---GIVE---");
//		giveSH1.give();
//		System.out.println("---GIVE ALL---");
//		giveSH1.giveAll();
//
//		// give surprises and sing
//		System.out.println("-- Give surprises and SING: type: LIFO--");
//		GiveSurpriseAndHug giveSS1 = new GiveSurpriseAndHug("LIFO",12);
//		giveSS1.put(GatherSurprises.gather());
//		giveSS1.put(fortuneCookie3);
//		giveSS1.put(GatherSurprises.gather());
//		ArrayList<ISurprise> giveSS = giveSS1.getBag().getBag();
//		for (ISurprise surprise: giveSS) {
//			surprise.enjoy();
//		}
//		System.out.println("Size of bag: " + giveSS.size());
//		System.out.println("---GIVE---");
//		giveSS1.give();
//		System.out.println("---GIVE ALL---");
//		giveSS1.giveAll();
//
//
//

	}

}
