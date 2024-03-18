/*

Level: 🟢🟢🟢
Status: ✔✔✔

*/
public class N_744 {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println(nextGreatestLetter(letters2, target2));

        char[] letters3 = {'c', 'f', 'j'};
        char target3 = 'd';
        System.out.println(nextGreatestLetter(letters3, target3));

        char[] letters4 = {'c', 'f', 'j'};
        char target4 = 'g';
        System.out.println(nextGreatestLetter(letters4, target4));

        char[] letters5 = {'c', 'f', 'j'};
        char target5 = 'k';
        System.out.println(nextGreatestLetter1(letters5, target5));

    }

    // 1 ms
    public static char nextGreatestLetter(char[] letters, char target) {
        char max = letters[0];
        boolean isUpdated = true;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                if (isUpdated) {
                    max = letters[i];
                    isUpdated = false;
                }
                max = (char) Math.min(max, letters[i]);
            }
        }
        return max;
    }

    // 0 ms
    public static char nextGreatestLetter1(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (letters[mid] <= target) start = mid + 1;
            else end = mid - 1;
        }
        return letters[start % letters.length];
        // return start == letters.length ? letters[0] : letters[start];
    }
}
