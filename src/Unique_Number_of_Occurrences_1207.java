import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

//not finished
public class Unique_Number_of_Occurrences_1207 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
        System.out.println(uniqueOccurrences(new int[]{1, 2}));
        System.out.println(uniqueOccurrences1(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
        System.out.println(uniqueOccurrences(new int[]{5, -2, -2, 1, 5, -2}));
    }

    private static boolean uniqueOccurrences1(int[] arr) {

        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == '-') {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    arr[i] = '-';
                    count++;
                }

            }
//            if (count == 0) {
//                list.add(++count);
//            } else {
//                list.add(++count);
//            }
                list.add(++count);
            count = 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new Hashtable<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (arr[j] == arr[arr.length - 1]) {
                    if (count == 0) {
                        map.put(arr[i], 1);
                    } else {
                        map.put(arr[i], count);
                    }
                    count = 0;
                }
            }
        }
//        System.out.println("result = " + result);
//        System.out.println("map = " + map);
        for (int n = 1; n <= map.size(); n++) {
            for (int m = 1; m <= map.size(); m++) {
                if (m != n) {
                    Integer integer = map.get(n);
                    Integer integer1 = map.get(m);
                    if (Objects.equals(integer, integer1)) {
                        return false;
                    }
                }
            }
        }
//        int size = map.size();
//        int left = 0;
//        int right = size - 1;
//        while (size > 0) {
//            if (map.get(left) != map.get(right)) {
//                if (left == right - 1) {
//
//                }
//                return false;
//            }
//            left++;
//            right--;
//            size--;
//        }
        return true;
    }

}