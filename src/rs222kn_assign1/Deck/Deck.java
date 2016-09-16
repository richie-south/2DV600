package rs222kn_assign1.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private ArrayList<Card> deck = new ArrayList<>();

  public Deck() {
    for (Card.Suite suite : Card.Suite.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        deck.add(new Card(rank, suite));
      }
    }
  }

  public void shuffle() {
    if (deck.size() == 52) {
      Collections.shuffle(deck);
    } else {
      System.out.println("Deck dose not contain 52 cards");
    }
  }

  public Card handOutNextCard() {
    Card handOut = deck.get(0);
    deck.remove(0);
    return handOut;

  }

  public int deckSize() {
    return deck.size();
  }
}
