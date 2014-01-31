// Author: Diego Gomez
import java.lang.reflect.Array;

public class Card implements Comparable {

	//private Card newCard;
	Rank Rank;
	 Suit Suit;

	public Card(Rank rank, Suit suit) {
		Card newCard = this;
		newCard.Rank = rank;
		newCard.Suit = suit;
		
	}

	public Card(Card card) {
		new Card(getRank(card), getSuit(card));
	}

	public Rank getRank(Card card) {
		return card.Rank;
	}

	public int getValue(Rank rank) {
		return rank.getValue();
	}

	public Suit getSuit(Card card) {
		return card.Suit;
	}

//	public int compareTo(Card card) {
//		return (getValue(getRank(this)) - getValue(getRank((Card) card)));
//	}

	@Override
	public int compareTo(Object card) {
		return (getValue(getRank(this)) - getValue(getRank((Card) card)));
//		System.out.println( getRank((Card) card));
//		return 0;
	}

}
