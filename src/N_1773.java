import java.util.List;

//Done
public class N_1773 {
    public static void main(String[] args) {

        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        System.out.println(countMatches(items, "color", "silver"));
        System.out.println(countMatches(items, "type", "phone"));
        System.out.println(countMatches(items, "name", "iphone"));

        System.out.println(countMatches(items, "color", "silver"));
        System.out.println(countMatches(items, "type", "phone"));
        System.out.println(countMatches(items, "name", "iphone"));

        System.out.println(countMatches(items, "color", "silver"));
        System.out.println(countMatches(items, "type", "phone"));
        System.out.println(countMatches(items, "name", "iphone"));

        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = switch (ruleKey) {
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
