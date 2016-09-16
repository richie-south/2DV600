package rs222kn_assign1.Deck;

/**
 * Created by richardsoderman on 2016-09-10.
 */
public class PlayCardsMain {
  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.deckSize());
    deck.shuffle();

    for (int i = 1; i < 53; i++) {
      Card card = deck.handOutNextCard();
      System.out.println("Card_" + i + ": " + card.getRank() + " " + card.getSuite());
    }
    System.out.println("Cards in deck:" + deck.deckSize());
  }
}
