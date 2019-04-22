package edu.dmacc.codedsm.April18Lab;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class AlternateFizzBuzzMapRepository implements MapRepository{

    private Map<Integer, Result> storage = new HashMap<Integer, Result>();

    @Override
    public void save(Result result) {
        printResults(result);
        storage.put(1, result);
    }

    public void printResults(Result result) {
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
}

