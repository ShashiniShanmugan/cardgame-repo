import java.util.ArrayList;
import java.util.Random;

public class Dealer {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        ArrayList<mCard> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }

        Random random = new Random();
        int index = random.nextInt(deck.size());
        Card pickedCard = deck.get(index);

        System.out.println("The picked card is: " + pickedCard);
    }
}