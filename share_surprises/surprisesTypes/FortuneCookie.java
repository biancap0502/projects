package share_surprises.surprisesTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	
	private static ArrayList<String> quotes = new ArrayList<>(Arrays.asList("All that I am or ever hope to be, I owe to my angel Mother.(A.Lincoln)",
															  "Any fool can know. The point is to understand.(A.Einstein)",
															  "Even death is not to be feared by one who has lived wisely.(Buddha)",
															  "Laughter is the tonic, the relief, the surcease for pain.(C.Chaplin)",
															  "Simplicity is the keynote of all true elegance.(Coco Chanel",
															  "Patience is bitter, but its fruit is sweet.(Aristotel)",
															  "In the practice of tolerance, one's enemy is the best teacher.(Dalai Lama)",
															  "It's a beautiful thing, the destruction of words.(G.Orwell)",
															  "A teacher affects eternity; he can never tell where his influence stops.(H.Adams)",
															  "If you want to be happy, be.(Leo Tolstoy)",
															  "One should eat to live, not live to eat.(Moliere)",
															  "We die only once, and for such a long time.(Moliere)",
															  "Whatever the mind can conceive and believe, it can achieve.(Napoleon Hill)",
															  "Learn the rules like a pro, so you can break them like an artist.(P.Picasso)",
															  "Wonder is the beginning of wisdom.(Socrates)",
															  "Not life, but good life, is to be chiefly valued.(Socrates)",
															  "For changes to be of value, they've got to be lasting and consistent.(T.Robbins)",
															  "Life is the flower for which love is the honey.(V.Hugo)",
															  "An intelligent hell would be better than a stupid paradise.(V.Hugo)",
															  "All our dreams can come true, if we have the courage to pursue them.(W.Disney)"));
															  
															  
	private String fortuneMessage;
	
	public String getFortuneMessage() {
		return this.fortuneMessage;
	}
	
	public FortuneCookie(String fortuneMessage) {
		this.fortuneMessage = fortuneMessage;
	}
	
	public static FortuneCookie generate() {
		Random random = new Random();
		int randomNumber = random.nextInt(quotes.size());
		return new FortuneCookie(quotes.get(randomNumber));
		
	}
	
	@Override
	public void enjoy() {
		System.out.print("The message from fortune cookie is: " + this.fortuneMessage + "\n");
	}

	@Override
	public String toString(){
		return "Fortune cookie message is: " + this.fortuneMessage + "\n";
	}

}
