import java.util.Stack;

/*

    Level: MEDIUM 🟡

    Result:
  Successfully finished with runtime 0 ms
  86.81% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n + m);
                     n - length of input string;
                     m - length of trimmed string;
       second way: O (1)

*/
public class Removing_Stars_From_a_String_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
        s = "erase*****";
        System.out.println(removeStars(s));
        s = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.append(stack.pop());
        return result.reverse().toString();
    }
}
