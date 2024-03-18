import java.util.HashMap;

//not done
public class Count_Sorted_Vowel_Strings_1641 {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(1));
        System.out.println(countVowelStrings2(4));
    }

    //First way
    public static int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;
        for (int j = 1; j < n; j++) {
            a = a + e + i + o + u;
            e = e + i + o + u;
            i = i + o + u;
            o = o + u;
        }
        return a + e + i + o + u;
    }

    //Second way
    private static final HashMap<Integer, int[]> base = new HashMap<>();

    public static int countVowelStrings2(int n) {
        base.put(0, new int[]{0});
        base.put(1, new int[]{5});
        base.put(2, new int[]{1, 2, 3, 4, 5});
        int[] count = count(n);
        return sum(count);
    }

    private static int[] count(int k) {
        if (base.containsKey(k)) {
            return base.get(k);
        }

        int[] prev = count(k - 1);
        for (int i = 1; i < prev.length; i++) {
            prev[i] = prev[i] + prev[i - 1];
        }
        return prev;
    }

    private static int sum(int[] array) {
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return result;
    }

}