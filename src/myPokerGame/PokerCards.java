package myPokerGame;

public class PokerCards {
	private final String[] cardssymbol = {"a","b","c","d"};
	private final String[] cardsname = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	private final String[] cardsjoker = {"joker1","joker2"};
	
	public String[] getCardssymbol() {
		return cardssymbol;
	}
	public String[] getCardsname() {
		return cardsname;
	}
	public String[] getCardsjoker() {
		return cardsjoker;
	}
	
}
