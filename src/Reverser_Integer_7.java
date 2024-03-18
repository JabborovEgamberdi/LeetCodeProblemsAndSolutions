import java.util.ArrayList;


//Done
public class Reverser_Integer_7 {
    public static void main(String[] args) {
        int a = -123;
        int b = 740;
        int c = 1534236469;
        System.out.println(reverse2(a));
        System.out.println("re: " + reverse2(b));
        System.out.println("re c: " + reverse(c));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    private static int reverse2(int number) {
        int abs = number;
        if (number < 0) {
            number = number * -1;
        }
        int lastDigit;
        int reverse = 0;
        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            if (reverse >= Integer.MIN_VALUE || reverse <= Integer.MAX_VALUE) {
                return 0;
            }
            number = number / 10;
        }
        System.out.println("abs = " + abs);
        System.out.println("number = " + number);
        return reverse;
    }

    // first solution
    private static int reverse(int number) {

        int abs = Math.abs(number);
        int x;
        ArrayList<Integer> reverse = new ArrayList<>();
        while (abs > 0) {
            x = abs % 10;
            abs = abs / 10;
            reverse.add(x);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reverse.size(); i++) {
            if (reverse.getFirst() == 0) {
                reverse.removeFirst();
            }
            result.append(reverse.get(i));
        }

        if (number < 0) {
            result.insert(0, '-');
        }
        System.out.println(result);
        x = Integer.parseInt(result.toString());
        return x;
    }

}