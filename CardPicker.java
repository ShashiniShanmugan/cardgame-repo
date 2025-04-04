import java.util.ArrayList;
import java.util.Random;

public class CardPicker {
  public static void main(String[] args) {
    // Define suits and ranks
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    // Create a deck of 52 cards
    ArrayList<String> deck = new ArrayList<>();

    for (String suit : suits) {
      for (String rank : ranks) {
        deck.add(rank + " of " + suit);
      }
    }

    // Pick a random card
    Random random = new Random();
    int index = random.nextInt(deck.size());
    String pickedCard = deck.get(index);

    // Print the picked card
    System.out.println("The picked card is: " + pickedCard);
  }
}