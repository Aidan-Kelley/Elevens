public class DeckTester {

    private static String[] ranks = { "1", "2", "3" };
    private static String[] suits = { "R", "B" };
    private static int[] values = { 1, 2, 3 };

    public static void displayTestDeck() {
        Deck deck = new Deck(ranks, suits, values);
        while (!deck.isEmpty())
            System.out.println(deck.drawACard());
    }
}