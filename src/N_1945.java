public class N_1945 {
    public static void main(String[] args) {

//        String s = "leetcode";
//        int k = 2;
//
//        System.out.println(getLucky(s, k));
//
//        System.out.println(getLucky("iiii", 1));

        System.out.println(getLucky("vbyytoijnbgtyrjlsc", 2));

    }

    static int count = 0;

    public static int getLucky(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            count += add(s.charAt(i) - 96);
        }
        if (k == 1) return count;
        int result = 0;
        while (k > 0) {
            while (count > 0) {
                result += count % 10;
                count = count / 10;
            }
            count = result;
            result = 0;
            k--;
        }
        return count;
    }

    private static int add(int num) {
        int res = 0;
        if (num > 9) {
            res += num / 10;
            res += num % 10;
        } else res = num;
        return res;
    }
}
