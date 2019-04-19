package edu.dmacc.codedsm.April18Lab;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapRepository implements MapRepository{

    private Map<Integer, Result> storage = new HashMap<Integer, Result>();

    @Override
    public void save(Result result) {
        storage.put(1, result);
    }
}
