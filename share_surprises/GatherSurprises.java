package share_surprises;

import share_surprises.surprisesTypes.Candies;
import share_surprises.surprisesTypes.FortuneCookie;
import share_surprises.surprisesTypes.ISurprise;
import share_surprises.surprisesTypes.MinionToy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class GatherSurprises {

    private GatherSurprises() {};


    // static method- returns an array of n surprises
    public static List<ISurprise> gather(int n){
        List<ISurprise> listOfSurprises = new ArrayList<ISurprise>(n);
        for (int i = 0; i < n; i++){
            listOfSurprises.add(gather());
        }
        return listOfSurprises;
    }

    // static method - returns one surprise
    public static ISurprise gather() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return FortuneCookie.generate();
        } else if (randomNumber == 1) {
            return Candies.generate();
        } else {
            return MinionToy.generate();
        }
    }

}

