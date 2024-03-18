import java.util.ArrayList;

public class Happy_Number_202 {
    public static void main(String[] args) {
        System.out.println(STR."isHappy(83) = \{isHappy(83)}");
        System.out.println(STR."isHappy(25) = \{isHappy(25)}");
        System.out.println(STR."isHappy(19) = \{isHappy(19)}");
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
        }
        return true;
    }

    public static boolean isContainsOne(ArrayList<Integer> arrayList) {
        int finalResult = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 1) {
                finalResult += arrayList.get(i) * arrayList.get(i);
            }
        }
        if (finalResult == 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                finalResult += arrayList.get(i) * arrayList.get(i);
            }
        }
        return true;
    }

}
