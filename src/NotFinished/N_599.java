package NotFinished;

import java.util.LinkedList;
import java.util.List;

public class N_599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Pica Express", "Shogun", "Burger King"};
        findRestaurant(list1, list2);
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    // 113 ms -> 11%
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum < min) {
                        list.clear();
                        list.add(list1[i]);
                        min = sum;
                    } else if (sum == min) {
                        list.add(list1[i]);
                    }
                }
            }
        }
        String[] result = new String[list.size()];
        list.toArray(result);
        return result;
    }
}