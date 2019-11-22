import java.util.Random;

public class Deck {
	// init variables
	private int size;
	private Card[] cards;

	// constructor
	public Deck (Card[] cards) {
		this.size = cards.length;
		this.cards = cards;
	}

	// utils
	public boolean isValidArrangement () {
		for (int i=0; i<size; i++) {
			if (cards[i].getOccurrences(cards) != 2) {
				return false;
			}
		}
		return true;
	}
	public boolean openCards (Card a, Card b) {
		if (a.equals(b)) {
			return true;
		}
		return false;
	}
	public void removeCard (int k) {
		Card[] newCards = new Card[size-1];
		
		for (int i=0; i<size; i++) {
			if (i < k) {
				newCards[i] = cards[i];
			}
			else if (i > k) {
				newCards[i] = cards[i+1];
			}
		}
		size--;
		cards = newCards;
	}

	// set/get
	public void setCard (int k, Card c) {
		cards[k] = c;
	}
	public void setCards (Card[] c) {
		cards = c;
	}
	public Card getCard (int k) {
		return cards[k];
	}
	public Card[] getCards () {
		return  cards;
	}
	public int getSize () {
		return size;
	}

	// shuffle function
	public void shuffle () {
		// TEMP
		System.out.println(this.cards);
		// END TEMP
		Random random = new Random();
		int tempSize = size;
		Card[] newCards = new Card[size];
		Card[] tempCards = this.getCards();
		Deck tempDeck = new Deck(tempCards);

		for (int i=0; i<tempSize; i++) {
			int r = random.nextInt(tempSize);
			newCards[i] = tempCards[r];
			tempDeck.removeCard(r);
			tempSize--;
			
		}
		this.cards = newCards;
		// TEMP
		System.out.println(this.cards);
		// END TEMP
	}
}