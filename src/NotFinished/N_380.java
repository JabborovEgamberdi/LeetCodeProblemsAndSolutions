package NotFinished;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class N_380 {

    public static void main(String[] args) {

    }
}

class RandomizedSet {

    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> values = new LinkedList<>();
    Random rand = new Random();
    boolean[] rs = new boolean[Integer.MAX_VALUE];
    int lastInsert = 0;

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (!rs[val]) {
            rs[val] = true;
            lastInsert = val;
            return true;
        }
        return false;
    }

    public boolean insert2(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, values.size());
        values.add(val);
        return false;
    }

    public boolean remove(int val) {
        if (map.containsKey(val)) {
            values.remove(map.get(val) - 1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public boolean remove2(int val) {
        if (rs[val]) {
            rs[val] = false;
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = rand.nextInt(values.size());
        return values.get(index);
    }
}
