package share_surprises.Test;

import share_surprises.containers.IBag;
import share_surprises.containers.RandomContainer;

public class TestRandom {

    public static void main(String[] args) {

        IBag firstRandomBag = new RandomContainer();
        IBag secondRandomBag = new RandomContainer();
        for (int i = 0; i < 4; i++){
            firstRandomBag.put(GatherSurprises.gather());
        }
        System.out.println("Surprises added to first bag are:");
        firstRandomBag.print();
        secondRandomBag.put(firstRandomBag);
        System.out.println("Surprises added to second bag from first bag are:");
        secondRandomBag.print();

        System.out.println("The order of removing elements from Random bag:");
        while(!secondRandomBag.isEmpty()){
            System.out.print(secondRandomBag.takeOut());
        }


    }


}
