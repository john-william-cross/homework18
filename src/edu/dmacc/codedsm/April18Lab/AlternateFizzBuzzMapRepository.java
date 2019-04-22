package edu.dmacc.codedsm.April18Lab;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class AlternateFizzBuzzMapRepository implements MapRepository{

    private Map<Integer, Result> storage = new HashMap<Integer, Result>();

    @Override
    public void save(Result result) {
        storage.put(1, result);
    }

    public static void printResults(Result result) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("fizzbuzz_result.txt");
            writer.println("Result is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public void printResults() {
    }
}

/*
private static void printResults(List<Card> playerHand, List<Card> dealerHand, String resultMessage) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("blackjack_log.txt");
            writer.println("Player\'s hand is: ");
            writer.println(showHand(playerHand));
            writer.println("Player\'s score is");
            writer.println(scoreHand(playerHand));
            writer.println("Dealer\'s hand is: ");
            writer.println(showHand(dealerHand));
            writer.println("Dealer\'s score is");
            writer.println(scoreHand(dealerHand));
            writer.println(resultMessage);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
 */