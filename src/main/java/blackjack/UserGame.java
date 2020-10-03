package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class UserGame {

	private static final int BLACK_JACK = 21;

	public static void main(String[] args) {
		Deck deckofcards = new Deck();
		ArrayList<Card> player = new ArrayList<Card>();
		ArrayList<Card> dealer = new ArrayList<Card>();

		Scanner morecards = new Scanner(System.in);
		Scanner money = new Scanner(System.in);
		Scanner game = new Scanner(System.in);
		int sumtotalPlayer = 0;
		int sumtotalDealer = 0;
		int totalMoney = 1000;
		int bet = 0;
		char anotherCard;
		char newGame;
		boolean isGame;

		System.out.println("***Welcome to Blackjack Game****");

		// New game loop
		do {
			player.clear();
			dealer.clear();
			isGame = true;
			deckofcards.shuffle();

			// Deal 2 cards to player
			for (int i = 0; i < 2; i++) {
				player.add(deckofcards.dealCard());
				sumtotalPlayer = calcSum(player);

			}
			System.out.println("Player cards: " + player);

			// Deal 1 card to dealer
			dealer.add(deckofcards.dealCard());
			System.out.println("Dealer cards: " + dealer);
			System.out.println("How much you want to bet? You can bet 1,5,10,50 or 100");
			bet = money.nextInt();
			if (bet != 1 && bet != 5 && bet != 10 && bet != 50 && bet != 100)
				System.out.println(" You only can bet on 1,5,10,50 or 100");
			System.out.println(" Player have in total :" + sumtotalPlayer);

			// Player get another card
			do {
				System.out.println(" Do you want another card ? Press Y for Yes ,Otherwise press N for No");
				anotherCard = morecards.next().charAt(0);
				if ((anotherCard != 'y') && (anotherCard != 'Y')) {
					System.out.println("Player stand with total of cards:" + sumtotalPlayer);
					break;
				} else {

					player.add(deckofcards.dealCard());
					System.out.println(" Player cards: " + player);
					sumtotalPlayer = calcSum(player);
					System.out.println(" Player have in total :" + sumtotalPlayer);
					if (sumtotalPlayer == BLACK_JACK) {
						System.out.println(" Player Won!!! ");
						totalMoney = totalMoney + 2 * bet;
						System.out.println(" Current money of the player: " + totalMoney);
						System.out.println(" The Game is Ended");
					}
					if (sumtotalPlayer > BLACK_JACK) {
						System.out.println(" Player Lose!!! ");
						totalMoney = totalMoney - bet;
						System.out.println(" Current money of the player: " + totalMoney);
						System.out.println(" The Game is Ended");
						isGame = false;

					}
				}

			} while (((anotherCard != 'n') && (anotherCard != 'N')) && (sumtotalPlayer < BLACK_JACK));

			// Dealer continue to play
			if (isGame) {
				do {
					dealer.add(deckofcards.dealCard());
					sumtotalDealer = calcSum(dealer);

				} while (sumtotalDealer <= 17);
				System.out.println(" Dealer cards: " + dealer);
				sumtotalDealer = calcSum(dealer);
				System.out.println(" Dealer have in total :" + sumtotalDealer);
				if (sumtotalDealer == BLACK_JACK) {
					System.out.println(" Dealer Won!!! ");
					totalMoney = totalMoney - bet;
					System.out.println(" Current money of the player: " + totalMoney);
					System.out.println(" The Game is Ended");
				} else if (sumtotalDealer > BLACK_JACK) {
					System.out.println(" Player Won!!! ");
					totalMoney = totalMoney + 2 * bet;
					System.out.println(" Current money of the player: " + totalMoney);
					System.out.println(" The Game is Ended");
				} else if (sumtotalPlayer > sumtotalDealer) {
					System.out.println(" Player Won!!! ");
					totalMoney = totalMoney + 2 * bet;
					System.out.println(" Current money of the player: " + totalMoney);
					System.out.println(" The Game is Ended");
				} else {
					System.out.println(" Dealer Won!!! ");
					totalMoney = totalMoney - bet;
					System.out.println(" Current money of the player: " + totalMoney);
					System.out.println(" The Game is Ended");
				}

			}

			System.out.println(" Do you want to play another game? ");
			newGame = game.next().charAt(0);

		} while ((newGame != 'n') && (newGame != 'N') && (totalMoney > 0));

		// Display message at the end
		if (totalMoney == 0) {
			System.out.println(" You don't have money to bet, Game is Ended!!!");
		} else if ((newGame == 'n') || (newGame == 'N')) {
			System.out.println(" The Game is Ended!!!! ");
		}

		game.close();
		morecards.close();
		money.close();

	}

	// Get the card value and calculate the sum of card's array
	public static int calcSum(ArrayList<Card> array) {
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			sum += array.get(i).getValueCard();

		}
		return sum;
	}
}
