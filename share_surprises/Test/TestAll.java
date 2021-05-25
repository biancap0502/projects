package share_surprises.Test;
import share_surprises.GatherSurprises;
import share_surprises.containers.BagFactoryStorage;
import share_surprises.containers.IBag;
import share_surprises.shareSurprises.GiveSurpriseAndApplause;
import share_surprises.shareSurprises.GiveSurpriseAndHug;
import share_surprises.shareSurprises.GiveSurpriseAndSing;
import share_surprises.surprisesTypes.Candies;
import share_surprises.surprisesTypes.FortuneCookie;
import share_surprises.surprisesTypes.ISurprise;
import share_surprises.surprisesTypes.MinionToy;

import java.util.List;


public class TestAll {


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

        BagFactoryStorage bagStorage = new BagFactoryStorage();
        IBag lifoContainer = bagStorage.makeBag("LIFO");
        List<ISurprise> surprises = GatherSurprises.gather(4);
        for (ISurprise s : surprises){
            lifoContainer.put(s);
        }

        System.out.println("\n---Surprises added into lifo container are:---");
        lifoContainer.print();

        GiveSurpriseAndApplause surprisesApplause = new GiveSurpriseAndApplause("FIFO", 20);
        surprisesApplause.put(lifoContainer);
        System.out.println("\n---Give first surprise from FIFO container with applause:---");
        surprisesApplause.give();
        System.out.println("\n---Give the rest of surprises form FIFO container with applause:---");
        surprisesApplause.giveAll();

        GiveSurpriseAndSing surpriseAndSing = new GiveSurpriseAndSing("LIFO", 20);
        GiveSurpriseAndHug surpriseAndHug = new GiveSurpriseAndHug("RANDOM", 20);
        surprises = GatherSurprises.gather(3);

        for (ISurprise s : surprises){
            s.enjoy();
            surpriseAndSing.put(s);
            surpriseAndHug.put(s);
        }


        System.out.println("\n---Give surprises from LIFO container with songs:---");
        surpriseAndSing.giveAll();

        System.out.println("\n---Give the rest of surprises from RANDOM container with hugs:---");
        surpriseAndHug.giveAll();


    }


}
