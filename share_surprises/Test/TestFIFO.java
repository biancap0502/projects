package share_surprises.Test;

import share_surprises.containers.FIFOContainer;
import share_surprises.containers.IBag;

public class TestFIFO {


    public static void main(String[] args) {

        IBag firstFifoBag = new FIFOContainer();
        IBag secondFifoBag = new FIFOContainer();
        for (int i = 0; i < 4; i++){
            firstFifoBag.put(GatherSurprises.gather());
        }
        System.out.println("Surprises added to first bag are:");
        firstFifoBag.print();
        secondFifoBag.put(firstFifoBag);
        System.out.println("Surprises added to second bag from first bag are:");
        secondFifoBag.print();

        System.out.println("The order of removing elements from FIFO bag:");
        while(!secondFifoBag.isEmpty()){
            System.out.print(secondFifoBag.takeOut());
        }
    }
}
