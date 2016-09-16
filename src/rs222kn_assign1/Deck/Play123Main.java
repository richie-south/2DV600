package rs222kn_assign1.Deck;

/**
 * Created by richardsoderman on 2016-09-10.
 */
public class Play123Main {
  public static void main(String[] args) {
    int wins = 0;
    int gameRuns = 10000;
    for (int i = 0; i < gameRuns; i++) {
      if (play()) {
        wins++;
      }
    }

    System.out.println((double) wins / (double) gameRuns * 100 + "%");
  }

  private static boolean play() {
    Deck deck = new Deck();
    deck.shuffle();
    int counter = 0;
    for (int i = 0; i < 52; i++) {
      Card card = deck.handOutNextCard();
      if (card.getRank().ordinal() == counter) {
        return false;
      }
      if (counter > 2) {
        counter = 0;
      }
      counter++;
    }
    return true;
  }
}
