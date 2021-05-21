package share_surprises.Test;

import share_surprises.containers.IBag;
import share_surprises.containers.LIFOContainer;


public class TestLIFO {

    public static void main(String[] args) {
        IBag firstLifoBag = new LIFOContainer();
        IBag secondLifoBag = new LIFOContainer();
        for (int i = 0; i < 4; i++){
            firstLifoBag.put(GatherSurprises.gather());
        }
        System.out.println("Surprises added to first bag are:");
        firstLifoBag.print();
        secondLifoBag.put(firstLifoBag);
        System.out.println("Surprises added to second bag from first bag are:");
        secondLifoBag.print();

        System.out.println("The order of removing elements from LIFO bag:");
        while(!secondLifoBag.isEmpty()){
            System.out.print(secondLifoBag.takeOut());
        }







    }
}
