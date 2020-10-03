package blackjack;

public class Card {

	private String cardNumber;
	private String shape;

	public Card(String type, String value) {
		shape = type;
		cardNumber = value;
	}

	// Display the card with card number and his shape
	public String toString() {
		return cardNumber + "   " + shape;
	}

	// Get card number
	public String getRank() {
		return cardNumber;
	}

	// Value of card
	public int getValueCard() {
		int value = 0;

		switch (cardNumber) {
		case "Ace" :
			value = 11;
			break;
		case "Jack" :
			value = 10;
			break;
		case "Queen" :
			value = 10;
			break;
		case "King" :
			value = 10;
			break;
		default :
			value = Integer.valueOf(cardNumber);
		}
		return value;

	}

}
