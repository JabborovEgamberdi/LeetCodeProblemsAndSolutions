package NotFinished;

/*
* Level: 🟢🟢🟢
* TimeComplexity: O(n^2)
* Runtime: Runtime 23 ms Beats 30.10% of users with Java
* * */
public class N_2418 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] result = sortPeople(names, heights);
        for (String name : result) {
            System.out.println(name);
        }
        System.out.println();
        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        String[] result2 = sortPeople(names2, heights2);
        for (String name : result2) {
            System.out.println(name);
        }
        System.out.println();
        String[] names3 = {"Alice", "Bob", "Bob"};
        int[] heights3 = {155, 185, 150};
        String[] result3 = sortPeople(names3, heights3);
        for (String name : result3) {
            System.out.println(name);
        }
        System.out.println();
    }

    // Runtime 23 ms Beats 30.10% of users with Java
    public static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        for (int i = 0; i < heights.length; i++) {
            int count = 0;
            for (int j = 0; j < heights.length; j++) {
                if (heights[j] > heights[i]) {
                    count++;
                }
            }
            result[count] = names[i];
        }
        return result;
    }
}
