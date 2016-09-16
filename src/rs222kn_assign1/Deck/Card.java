package rs222kn_assign1.Deck;

public class Card {
  private Suite suite;
  private Rank rank;

  public enum Rank {
    Ace,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King;
  }

  public enum Suite {
    Clubs,
    Spades,
    Hearts,
    Diamonds;
  }

  public Card(Rank rank, Suite suite) {
    this.suite = suite;
    this.rank = rank;
  }

  public Rank getRank() {
    return rank;
  }

  public Suite getSuite() {
    return suite;
  }

}
