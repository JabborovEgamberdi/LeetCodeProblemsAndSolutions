package NotFinished;

public class N_443 {
    public static void main(String[] args) {

        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars1));

        char[] chars2 = {'a'};
        System.out.println(compress(chars2));

        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars3));

    }

    public static int compress(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            int c = 1;
            if (chars[i] != '0') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        c++;
                        chars[j] = '0';
                    }
                }
                if (c == 1) count++;
                else if (c < 10) count += 2;
                else {
                    int size = size(String.valueOf(count));
                    count++;
                    count += String.valueOf(count).length() + 1;
                }
            }
        }
        return count;
    }

    private static int size(String num) {
        return num.length() + 1;
    }
}
