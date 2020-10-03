package blackjack;

public class Deck {

	private Card deck[];
	private int firstcard;

	public Deck() {
		String shapes[] = { "heart", "spade", "diamond", "club" };
		String cardsnumbers[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		deck = new Card[52];
		firstcard = 0;
		int pos = 0;

		// Array of cards
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck[pos] = new Card(shapes[i], cardsnumbers[j]);
				pos++;
			}
		}

	}

	// Shuffle cards
	public void shuffle() {
		for (int i = 0; i < deck.length; i++) {
			int j = (int) (Math.random() * 52);
			Card temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;

		}
	}

	// Deal cards
	public Card dealCard() {
		if (firstcard < deck.length)
			return deck[firstcard++];
		else
			return null;
	}
}
