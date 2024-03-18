/*

    Level: EASY 🟢🟢🟢

    Result:
  Successfully finished with runtime 0 ms
  65.93% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n);
                     n - length of input string;
       second way: O (n)

*/

public class Defanging_an_IP_Address_1108 {
    public static void main(String[] args) {
        String address = "0000000";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr(address).equals("1[.]1[.]1[.]1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                result.append(address.charAt(i));
            } else if (address.charAt(i) == '.') {
                result.append("[").append(address.charAt(i)).append("]");
            }
        }
        return result.toString();
    }

    public static String defangIPaddr2(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                result += address.charAt(i);
            } else if (address.charAt(i) == '.') {
                result += "[.]";
            }
        }
        return result;
    }

}
